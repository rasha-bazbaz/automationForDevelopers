import java.io.IOException;
import java.net.http.HttpResponse;

public class runHttpReq {
	public static void main(String[] args) throws IOException, InterruptedException {
		HttpResponse resp = RequestsCall.GetRequest("https://jsonplaceholder.typicode.com/posts");
		System.out.println(resp.body()); 
		System.out.println("=-=-=-=-=-=-=-=-=-==-=--=");
		System.out.println(resp.statusCode());
	}
}
