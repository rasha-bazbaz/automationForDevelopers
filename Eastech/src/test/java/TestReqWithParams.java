import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.net.http.HttpResponse;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestReqWithParams {
	@Test
	@Parameters({"type", "path", "body", "expStatus"})
	public void testReq(String type, String path, String body, String expStatus) throws IOException, InterruptedException {
		HttpResponse<String> resp = ReqValidation.runReq(type, path, body);
		System.out.println(resp.body());
		assertEquals(resp.statusCode(), Integer.parseInt(expStatus));
	}
}
