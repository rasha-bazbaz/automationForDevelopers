import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgOrder {
	@Test(groups = {"valid"}, enabled = false)
	public void testMethod() {
		System.out.println("testMethod");
	}
	
	@Test(groups = {"invalid"}, dependsOnGroups = {"valid"}, alwaysRun = true)
	public void testValidate() {
		System.out.println("testValidate");
		assertEquals("test", "testRasha");
	}
	
	
	@Test(groups = {"valid"})
	public void testValidate2() {
		System.out.println("testValidate2");
		assertEquals(1, 11);
	}
	
	
}
