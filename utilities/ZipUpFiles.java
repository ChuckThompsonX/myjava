package myjava.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipUpFiles {

	private static final String OUTPUT_ZIP_FILE = "C:\\Temp\\zip\\ZippedFile.zip";
	private static final String SOURCE_FOLDER = "C:\\Temp\\temp";

	List<String> fileList;

	public ZipUpFiles() {
		fileList = new ArrayList<String>();
	}

	/**
	 * @param args
	 */
	public static void main(String... args) {
		File f = new File(SOURCE_FOLDER);
		ZipUpFiles appZip = new ZipUpFiles();
		appZip.generateFileList(f);
		appZip.zipIt(OUTPUT_ZIP_FILE);
	}

	/**
	 * ZIP it
	 * @param zipFile
	 */
	public void zipIt(String zipFile) {
		byte[] buffer = new byte[1024];

		try {
			FileOutputStream fos = new FileOutputStream(zipFile);
			ZipOutputStream zos = new ZipOutputStream(fos);

			for (String file : fileList) {
				ZipEntry ze = new ZipEntry(file);
				zos.putNextEntry(ze);
				String pathFile = SOURCE_FOLDER + File.separator + file;
				FileInputStream in = new FileInputStream(pathFile);

				int len;
				while ((len = in.read(buffer)) > 0) {
					zos.write(buffer, 0, len);
				}

				in.close();
			}

			zos.closeEntry();
			zos.close();
			System.out.println("Done");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Traverse a directory and get all files, and add the file into fileList
	 * @param node
	 */
	public void generateFileList(File node) {
		if (node.isFile()) {
			int start = SOURCE_FOLDER.length() + 1;
			int end = node.getPath().length();
			String filePath = node.getPath().substring(start, end);
			System.out.println(filePath);
			fileList.add(filePath);
		}

		if (node.isDirectory()) {
			String[] subNote = node.list();
			for (String filename : subNote) {
				File f = new File(node, filename);
				generateFileList(f);
			}
		}
	}
}
