import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class AppHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("test.txt");
		try {
			FileReader fr = new FileReader(file);
			System.out.println("continuing...");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found: " + file.toString());
		}
		System.out.println("Finished.");
	}

}
