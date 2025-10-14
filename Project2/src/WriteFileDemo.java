//writing into the file

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedWriter bw=new BufferedWriter(new FileWriter("output.txt"))){
			bw.write("Hello from Java");
			bw.newLine();
			bw.write("This is a file writing demonstration");
			System.out.println("File is created");
		}
		catch(IOException ioe) {
			System.out.println("Exception generated !!");
		}
		
	}

}
