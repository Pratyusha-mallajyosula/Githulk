package Testingmvn;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

public class Testmvn {
	
	@BeforeClass
	public void bfclass()
	{
		System.out.println("beforeclass");
	}
	@AfterClass
	public void afclass()
	{
		System.out.println("afterclass");
	}
	@BeforeTest
	public void before()
	{
		System.out.println("beforetest...");
	}
	
	@BeforeMethod
	public void method1()
	{
		System.out.println("before method");
	}
	
	@AfterMethod
	public void aftermethod2()
	{
		System.out.println("aftermethod");
	}
	
	@Test
	public void first()
	{
		System.out.println("hi maven...");
	}
	
	@AfterTest
	public void after()
	{
		System.out.println("after test");
	}
	
	@Test(dependsOnMethods = "first")
	public void second()
	{
		System.out.println("one more test");
	}
	
	@Test
	public void third()
	{
		System.out.println("3");
	}
}
