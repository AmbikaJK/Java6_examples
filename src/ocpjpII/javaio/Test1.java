package ocpjpII.javaio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("temp.data");
			DataOutputStream dos = new DataOutputStream(fos);
			for (int i = 0; i < 10; i++) {
				dos.writeInt(i);
			}
			
			FileInputStream fis = new FileInputStream("temp.data");
			DataInputStream dis = new DataInputStream(fis);
			for (int i = 0; i < 10; i++) {
				System.out.println(dis.readInt());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
