package com.java.test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class GenFile {

	static final String STARTING_FILE = "c:\\temp\\test.xlsx";
	static final String ENDING_FILE = "c:\\temp\\test";
	static final int BUF_SIZE = 1024;
	static final int SHIFT = 3;
	
	public static void main(String... args) throws FileNotFoundException, IOException {
		File startingFile = new File(STARTING_FILE);
		FileInputStream fis = new FileInputStream(startingFile);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		byte[] buf = new byte[BUF_SIZE];
		int readNum = -1;

		while ((readNum = fis.read(buf)) != -1) {
			byte[] buf2 = new byte[BUF_SIZE];
			for (int i = 0; i < readNum; i++) {
				buf2[i] = rotateRight(buf[i], SHIFT);
				//buf2[i] = rotateLeft(buf[i], SHIFT);
			}
			bos.write(buf, 0, readNum);
		}

		File endingFile = new File(ENDING_FILE);
		FileOutputStream fos = new FileOutputStream(endingFile);
		byte[] bytes = bos.toByteArray();
		fos.write(bytes);
		fos.flush();
		bos.flush();
		fos.close();
		bos.close();
		fis.close();

		System.out.println("Done!");
	}

	public static byte rotateRight(byte bits, int shift) {
		return (byte) (((bits & 0xff) >>> shift) | ((bits & 0xff) << (Byte.SIZE - shift)));
	}

	public static byte rotateLeft(byte bits, int shift) {
		return (byte) (((bits & 0xff) << shift) | ((bits & 0xff) >>> (Byte.SIZE - shift)));
	}
}
