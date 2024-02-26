import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class RequestsCall {
	public static HttpResponse<String> GetRequest(String uri) throws IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
	    HttpRequest request = HttpRequest.newBuilder()
	          .uri(URI.create(uri))
	          .GET()
	          .build();

	    HttpResponse<String> response =
	          client.send(request, BodyHandlers.ofString());

		return response;
	}
	
	public static HttpResponse<String> DeleteRequest(String uri) throws IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
	    HttpRequest request = HttpRequest.newBuilder()
	          .uri(URI.create(uri))
	          .DELETE()
	          .build();

	    HttpResponse<String> response =
	          client.send(request, BodyHandlers.ofString());

		return response;
	}
	
	
	public static HttpResponse<String> PostRequest(String uri, String data) throws IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
	    HttpRequest request = HttpRequest.newBuilder()
	          .uri(URI.create(uri))
	          .POST(BodyPublishers.ofString(data))
	          .header("Content-type", "application/json; charset=UTF-8")
	          .build();

	    HttpResponse<String> response =
	          client.send(request, BodyHandlers.ofString());

		return response;
	}
	
	public static HttpResponse<String> PutRequest(String uri, String data) throws IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
	    HttpRequest request = HttpRequest.newBuilder()
	          .uri(URI.create(uri))
	          .PUT(BodyPublishers.ofString(data))
	          .header("Content-type", "application/json; charset=UTF-8")
	          .build();

	    HttpResponse<String> response =
	          client.send(request, BodyHandlers.ofString());

		return response;
	}
	

}
