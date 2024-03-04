import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.ArrayList;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TestWithFactory {
	String type;
	String path;
	String body; 
	String expStatus;
	int expStatusInt;
	public TestWithFactory(String type, String path, String body, String expStatus) {
		this.type = type;
		this.body = body;
		this.path = path;
		this.expStatus = expStatus;
		
	}
	
	@Test
	public void parseStatus() {
		this.expStatusInt = Integer.parseInt(expStatus);
		System.out.println(this.expStatusInt);
	}
	
	@Test
	public void checkType() {
		ArrayList<String> types = new ArrayList<String>();
		types.add("GET");
		types.add("POST");
		types.add("PUT");
		types.add("DELETE");
		assertTrue(types.contains(type));
	}
	@Test(dependsOnMethods = "parseStatus")
	public void testReq() throws IOException, InterruptedException {
		HttpResponse<String> resp = ReqValidation.runReq(type, path, body);
		System.out.println(resp.body());
		assertEquals(resp.statusCode(), this.expStatusInt);
	}
	
	
	@Factory
	public static Object[] createInstances() throws Exception {
		ArrayList<String[]> data = WorkWithCSV.readAllLines("TestCasesFull.csv");
		Object[] instances = new Object[data.size()];
		for(int i=0;i<data.size();i++) {
			String[] dataItem = data.get(i);
			instances[i] = new TestWithFactory(dataItem[0], dataItem[1], dataItem[2], dataItem[3]);
		}
		return instances;
	}
}
