
package p11;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class lala {

	public static void main(String[] args) throws IOException  {
		// TODO Auto
			//connected to file
			FileInputStream fis= new FileInputStream("abc.txt");
	       int data=  fis.read();
	       System.out.println(data);
		}
		
}

