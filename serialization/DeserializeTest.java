package myjava.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeTest {

	public static void main(String... args) {
		// Select object location
		String root = File.listRoots()[0].getAbsolutePath();
		String fileName = root + File.separator + "temp" + File.separator;
		fileName += "employee.ser";

		try {
			// Read object state back in
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee empNew = (Employee) ois.readObject();
			ois.close();

			System.out.println("emp New Obj->" + empNew);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
}
