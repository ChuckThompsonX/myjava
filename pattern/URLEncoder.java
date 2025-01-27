package com.planet.patterns;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Base64;

public class URLEncoder {

	/**
	 * @param args
	 */
	public static void main(String... args) {
		String httpParam = "someparamvalue";
		httpParam = hashString(httpParam);
		System.out.println("HASHED: " + httpParam);
		httpParam = base64ParamEncode(httpParam);
		System.out.println("ENCODE: " + httpParam);
		httpParam = base64ParamDecode(httpParam);
		System.out.println("DECODE: " + httpParam);
	}

	/**
	 * Add extra security to help avert users knowing the exact name of the string.
	 * 
	 * @param str
	 * @return
	 */
	public static String hashString(String str) {
		MessageDigest messageDigest = null;
		try {
			messageDigest = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		if (messageDigest != null) {
			messageDigest.update(str.getBytes());
			String hashedStr = new String(messageDigest.digest());
			// Add more levels of encryption here for extra security
			return hashedStr;
		}
		
		return str;
	}
	
	/**
	 * Used to decode a String parameter.
	 * 
	 * @param str
	 * @return
	 */
	public static String base64ParamDecode(String str) {
	    Base64 decoder = new Base64();
	    byte[] bytes = str.getBytes();
	    byte[] decodedBytes = decoder.decode(bytes);
		String result = new String(decodedBytes);
	    return result;
	}

	/**
	 * Used to encode a String parameter.
	 * 
	 * @param str
	 * @return
	 */
	public static String base64ParamEncode(String str) {
	    byte[] bytes = str.getBytes();
	    return base64ParamEncode(bytes);
	}

	/**
	 * Used to encode a byte array parameter.
	 * 
	 * @param bytes
	 * @return
	 */
	public static String base64ParamEncode(byte[] bytes) {
	    Base64 encoder = new Base64();
	    byte[] encodedBytes = encoder.encode(bytes);
	    String result = new String(encodedBytes);
	    return result;
	}
}
