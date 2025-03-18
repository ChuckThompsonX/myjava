package myjava.serialize;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeTest {

	public static void main(String... args) {
		// set storage
		String root = File.listRoots()[0].getAbsolutePath();
		String fileName = root + File.separator + "temp" + File.separator;
		fileName += "employee.ser";
		
		// give object state
		Employee emp = new Employee();
		emp.setId(101);
		emp.setName("Chuck");
		emp.setSalary(50000);

		try {
			// serialize to file
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
			fos.close();

			System.out.println("emp Obj->" + emp);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
