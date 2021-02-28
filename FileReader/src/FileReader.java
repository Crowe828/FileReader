import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/christianrowe/Documents/Example Projects/captmidn.txt");
		Scanner scan = new Scanner(file);
		
		String fileContent = "TESTY TEST TEST";
		while (scan.hasNextLine()) {
			fileContent = fileContent.concat(scan.nextLine() + "\n");
//			System.out.println(scan.nextLine());
		}
		
		FileWriter writer = new FileWriter("/Users/christianrowe/Documents/Example Projects/newfile.txt");
		writer.write(fileContent);
		writer.close();
	}

}
