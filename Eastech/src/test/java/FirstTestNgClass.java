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

public class FirstTestNgClass {
	@Test
	public void testMethod() {
		System.out.println("testMethod");
	}
	
	@Test
	public void testValidate() {
		System.out.println("testValidate");
		assertEquals("test", "testRasha");
	}
	
	
	@Test
	public void testValidate2() {
		System.out.println("testValidate2");
		assertEquals(1, 1);
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("BeforeMethod");
	}
	
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("BeforeSuite");
	}
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("BeforeTest");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("AfterClass");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
	}
}
