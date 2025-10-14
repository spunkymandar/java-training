import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingJDK7 {
	public static void main(String[] args) throws FileNotFoundException {
		readFile1();// prior to jdk7
		readFile2();//from jdk7 : try with resources
		readFile3();//from jdk9: try with resources 
	}

	private static void readFile1() {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("data.txt"));
			System.out.println(br.readLine());
		} catch (IOException ioe) {
			System.out.println("File not found");
		} 
		finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException io) {

			}
		}
	}
	
	//from jdk7
	private static void readFile2() {
		// TODO Auto-generated method stub
		
		//resources are initiated within try argument
		try(BufferedReader br=new BufferedReader(new FileReader("data.txt"));) {
			
			System.out.println(br.readLine());
		} catch (IOException ioe) {
			System.out.println("File not found");
		} 
		
	}
	
	//from jdk9
		private static void readFile3() throws FileNotFoundException {
			BufferedReader br=new BufferedReader(new FileReader("data.txt"));
			//resources are initiated outside the try and you can use the references inside the try argument
			// TODO Auto-generated method stub
			try(br) {
				
				System.out.println(br.readLine());
			} catch (IOException ioe) {
				System.out.println("File not found");
			} 
			
		}

}
