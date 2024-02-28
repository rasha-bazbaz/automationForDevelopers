import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.net.http.HttpResponse;

import org.testng.annotations.Test;

public class FirstApiTest {
	@Test
	public void testGet() throws IOException, InterruptedException {
		HttpResponse<String> resp = RequestsCall.GetRequest("https://jsonplaceholder.typicode.com/posts");
	
		
		assertEquals(resp.statusCode(), 200);
	}
	
	@Test
	public void testPost() throws IOException, InterruptedException {
		String body ="{\"userId\": 1,\"title\": \"test title\",\"body\": \"test body\"}";
		HttpResponse<String> resp2 = RequestsCall.PostRequest("https://jsonplaceholder.typicode.com/posts", body);
		
		assertEquals(resp2.statusCode(), 201);
		
	}
}
