/**
 * FileReaderWriter
 * 
 * Character oriented.
 */
package com.planet.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	public static void main(String... args) {

		String root = File.listRoots()[0].getAbsolutePath();
		String path = root + File.separator + "temp" + File.separator;
		String file1 = path + "fileR.txt";
		String file2 = path + "fileW.txt";
		
		// Read file
		try (FileReader fr = new FileReader(file1)) {
			int c;
			while ((c = fr.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (IOException ioe) {
		    ioe.printStackTrace();
		}

		// Write file
		String s = "Write this message to file 123.";
		try (FileWriter fw = new FileWriter(file2)) {
			fw.write(s);
		} catch (IOException ioe) {
		    ioe.printStackTrace();
		}
	}
}
