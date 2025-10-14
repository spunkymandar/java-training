//throws keyword: forces the invoker to handle the excpetion
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		readFile();
		}
		catch(FileNotFoundException fe) {
			System.out.println("File not found");
		}

	}

	private static void readFile() throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		FileReader fr=new FileReader("sample.txt");
		
	}

}
