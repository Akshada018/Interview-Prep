package ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {

	public void checkFile() throws IOException{
		FileReader fr = new FileReader("E:\\Resume\\Akshada_Shinde_Java_Developer.pdf");
//		FileReader fr = new FileReader("abc.txt");		will through exception --> FileNotFoundException
		System.out.println(fr.getEncoding()); 
		
		fr.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		ThrowsExample te = new ThrowsExample();
		te.checkFile();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
