import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.net.http.HttpResponse;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestWithDataProvider {

	@DataProvider(name = "TestData")
	public Object[][] dataProviderMethod() throws Exception{
		return WorkWithCSV.readAllLinesAsArray("TestCasesFull.csv");
	}
	
	@Test(dataProvider = "TestData")
	public void testReq(String type, String path, String body, String expStatus) throws IOException, InterruptedException {
		HttpResponse<String> resp = ReqValidation.runReq(type, path, body);
		System.out.println(resp.body());
		assertEquals(resp.statusCode(), Integer.parseInt(expStatus));
	}
	
}
