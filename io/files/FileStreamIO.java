/**
 * FileStreamIO
 * 
 * Byte oriented.
 * Not able to work with Unicode.
 */
package com.planet.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamIO {

	public static void main(String... args) {

		String root = File.listRoots()[0].getAbsolutePath();
		String path = root + File.separator + "temp" + File.separator;
		String file1 = path + "fileStreamR.txt";
		String file2 = path + "fileStreamW.txt";

		// Read file
		try (FileInputStream fin = new FileInputStream(file1)) {
			int c;
			while ((c = fin.read()) != -1) {
				System.out.print((char) c);
			}			
		} 
		catch (IOException ioe) {
		    ioe.printStackTrace();
		}
		
		// Write file
		String s = "Write this message to file 123.";
		try (FileOutputStream fout = new FileOutputStream(file2)) {
			byte[] b = s.getBytes();
			fout.write(b);
		} 
		catch (IOException ioe) {
		    ioe.printStackTrace();
		}
	}

}
