import java.io.IOException;
import java.net.http.HttpResponse;

public class runHttpReq {
	public static void main(String[] args) throws IOException, InterruptedException {
		HttpResponse<String> resp = RequestsCall.GetRequest("https://jsonplaceholder.typicode.com/posts");
		System.out.println(resp.body()); 
		System.out.println("=-=-=-=-=-=-=-=-=-==-=--=");
		System.out.println(resp.statusCode());
		
		String body ="{\"userId\": 1,\"title\": \"test title\",\"body\": \"test body\"}";
		HttpResponse<String> resp2 = RequestsCall.PostRequest("https://jsonplaceholder.typicode.com/posts", body);
		System.out.println(resp2.body()); 
		System.out.println("=-=-=-=-=-=-=-=-=-==-=--=");
		System.out.println(resp2.statusCode());
	}
}
