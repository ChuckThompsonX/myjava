package com.planet.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class SmallFiles {

	public static void main(String... args) {
		
		String root = File.listRoots()[0].getAbsolutePath();
		String path = root + File.separator + "temp" + File.separator;
		String path1 = path + "smallfileR.txt";
		String path2 = path + "smallfileW.txt";
		
		try {
			// read from file
			Path file1 = Paths.get(path1);
			byte[] fileArray = Files.readAllBytes(file1);
			String content = new String(fileArray, "UTF-8");
			System.out.println(content);

			// write from file
			Path file2 = Paths.get(path2);
			String str = "Append some more stuff!!!";
			byte[] buf = str.getBytes();
			
			boolean fileExists = Files.exists(file2);
			if (fileExists) {
				Files.write(file2, buf, StandardOpenOption.APPEND);
			}
			else {
				Files.write(file2, buf);
			}
			// if writing to same file many times, the above has to open/close 
			// file on disk each time, use a buffered writer instead

			System.out.println("Done!");
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
