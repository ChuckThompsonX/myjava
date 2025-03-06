package myjava.utilities;

import java.io.InputStream;
import java.io.IOException;

public class EchoBytes {

  	public static void main(String... args) {
		try {
			byte[] bytes = new byte[10];

			// Read from console input
			InputStream stream = System.in;
			int bytesRead = stream.read(bytes);
			System.out.println(bytesRead);
			
			for (int i = 0; i < bytes.length; i++) {
				char ch = (char) bytes[i];
				System.out.print(ch);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
