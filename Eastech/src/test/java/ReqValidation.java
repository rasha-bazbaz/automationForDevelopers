import java.net.http.HttpResponse;
import java.util.ArrayList;

public class ReqValidation {
	public static void main(String[] args) throws Exception {
		ArrayList<String[]> data = WorkWithCSV.readAllLines("TestCasesFull.csv");
		for(int i=0;i<data.size();i++) {
			
			String type = data.get(i)[0];
			String path = data.get(i)[1];
			String body = data.get(i)[2];
			String expStatus = data.get(i)[3];
			String reqUrl = "https://jsonplaceholder.typicode.com" + path;
			HttpResponse<String> response = null;
			switch (type.toLowerCase()){
			case "get": 
				response = RequestsCall.GetRequest(reqUrl);
				break;
			case "put": 
				response = RequestsCall.PutRequest(reqUrl, body);
				break;
			case "post": 
				response = RequestsCall.PostRequest(reqUrl, body);
				break;
			case "delete": 
				response = RequestsCall.DeleteRequest(reqUrl);
				break;
			}
			
			///System.out.println(response.body());
			if(response.statusCode() != Integer.parseInt(expStatus)) {
				System.out.println(type);
				System.out.println(reqUrl);
				System.out.println(response.statusCode() +" != "+ expStatus);
			}
		}
	}
}
