import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BookReader {
	 public static void main(String []args) {
		  String csvFile = "/Users/murthyraju/Documents/neon-workspace/Books/src/50books.csv";
	        String line = "";
	        String cvsSplitBy = ",";

	        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

	            while ((line = br.readLine()) != null) {

	                // use comma as separator
	                String[] book = line.split(cvsSplitBy);
 
	                System.out.println("Title - " + book[1] + " , author - " + book[2] );

	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	   }
}
