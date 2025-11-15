package exceptionHandlingExamples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		try(FileReader reader = new FileReader("E:\\Resume\\Akshada_Shinde_Java_Developer.pdf")){ 	// --> try-with-resource block
//				
//			int data;
//			while((data = reader.read()) != -1) {
//				
//				System.out.print((char)data);	// print each character --> binary file
//			}
//			
//		}catch(IOException e) {
//		
//			e.printStackTrace();
//		}
		
//		try(FileInputStream fis = new FileInputStream ("E:\\Resume\\Akshada_Shinde_Java_Developer.pdf")){
//			
//			int data;
//			while((data = fis.read()) != -1) {
//				System.out.print(data + " ");	// print raw byte values, not chars
//			}
//			
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		
		try (BufferedReader reader = new BufferedReader(
                new FileReader("E:\\Resume\\Akshada_Shinde_Java_Developer.pdf"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // prints each line
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

		try(Snippet sn = new Snippet()){
			System.out.println("Connecting...");
			
//			int[] arr = {10,23,39,30,70};
//			System.out.println(arr[7]);
			
			sn.trying();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// Output for //			System.out.println(arr[7]);
//		Connecting...
//		Disconnecting...
//		java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 5
//			at exceptionHandlingExamples.TryWithResourcesDemo.main(TryWithResourcesDemo.java:52)

		
		// O/P for sn.trying();
//		Connecting...
//		Trying...
//		Disconnecting...

	}
}
