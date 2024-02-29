import java.awt.image.RescaleOp;
import java.io.FileReader;
import java.net.http.HttpResponse;
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

	public static void main(String[] args) throws Exception {
		ArrayList<String[]> data = WorkWithCSV.readAllLines("TestCasesFull.csv");
		for(int i=0;i<data.size();i++) {
			String type = data.get(i)[0];
			String url = "https://jsonplaceholder.typicode.com" + data.get(i)[1];
			String body = data.get(i)[2];
			int expStatus = Integer.parseInt(data.get(i)[3]);
			switch (type) {
			case "GET": {
				HttpResponse<String> resp = RequestsCall.GetRequest(url);
				if (resp.statusCode() == expStatus) {
					System.out.println("pass");
				}else {
					System.out.println("fail");
				}
				break;
			}
			case "POST": {

				break;
			}
			case "PUT": {

				break;
			}
			case "DELETE": {

				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + type);
			}
		}

	}

}
