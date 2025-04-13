/**
 * BufferedFileIO
 * 
 * In cases where IO is expensive.
 * Read/Write data to/from memory buffer.
 * Native IO API only called when buffer is empty/full. 
 */
package com.planet.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BufferedFileIO {

	public static void main(String... args) {
		
		Charset charset = Charset.forName("US-ASCII");
		String root = File.listRoots()[0].getAbsolutePath();
		String path = root + File.separator + "temp" + File.separator;
		Path file1 = Paths.get(path + "bufferedR.txt");
		Path file2 = Paths.get(path + "bufferedW.txt");
		
		// read from file
		try (BufferedReader reader = Files.newBufferedReader(file1, charset)) {
			String line = null;
			while ((line = reader.readLine()) != null) {
		        	System.out.println(line);
			}
		} 
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		// write to file
		String s = "Write this message to file 123.";
		try (BufferedWriter writer = Files.newBufferedWriter(file2, charset)) {
		    	writer.write(s, 0, s.length());
		} 
		catch (IOException ioe) {
		    	ioe.printStackTrace();
		}
	}
}
