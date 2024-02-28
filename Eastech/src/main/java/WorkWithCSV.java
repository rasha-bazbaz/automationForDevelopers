import java.io.FileReader;
import java.util.ArrayList;

import com.opencsv.CSVReader;

public class WorkWithCSV {
	public static ArrayList<String[]> readAllLines(String filePath) throws Exception {
		CSVReader reader = new CSVReader(new FileReader(filePath));

		ArrayList<String[]> data = new ArrayList<String[]>();

		// read line by line
		String[] record = null;
		reader.readNext();
		while ((record = reader.readNext()) != null) {
			data.add(record);
			
		}		
		reader.close();
		return data;
	}
	
	
}
