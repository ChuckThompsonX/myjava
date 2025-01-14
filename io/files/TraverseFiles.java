package com.planet.file;

import java.io.File;
import java.util.Date;

public class TraverseFiles {

	public static void main(String... args) {
		TraverseFiles tf = new TraverseFiles();
		tf.traverseDirectory("C:\\Temp\\dir\\dir\\dir");
	}

  public void traverseDirectory(String dir) {
    	// start at a directory
        File folder = new File(dir);
        // list all file/dir entities in that directory
        File[] listOfFiles = folder.listFiles();

        // loop thru each entity
        for (File file : listOfFiles) {
            if (!file.isDirectory()) {
            	// print file time stamp
            	long lastChanged = file.lastModified();
            	Date d = new Date(lastChanged);
            	System.out.println(file.getAbsolutePath() + " " + d);
            }
            else {
            	// if it's a directory recursively spin thru its sub-entities
            	TraverseFiles tf = new TraverseFiles();
            	tf.traverseDirectory(file.getAbsolutePath());
            }
        }
    }
}
