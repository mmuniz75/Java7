package lab;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class Closeable {

	@Test
	public void test() {
		String file = "C:\\temp\\moves.txt";
		try{
			FileOutputStream fos = new FileOutputStream(file);
			DataOutputStream dos = new DataOutputStream(fos);
			dos.write("The last Samuray".getBytes());
			
		}catch(IOException io){
			io.printStackTrace();
		}
				
	}

}
