
	package Testingmvn;

	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.*;

	public class Testsecond {
		
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
		@Parameters({"url"})
		
		@Test
		public void first(String urlname)
		{
			System.out.println("hi maven...");
			System.out.println(urlname);
		}
		
		@DataProvider
		public Object[][] data()
		{
			Object getData[][]=new Object[3][2];
			getData[0][0]="firstusername";
			getData[0][1]="pswd";
			getData[1][0]="secondusername";
			getData[1][1]="pswd";
			getData[2][0]="thirdusername";
			getData[2][1]="pswd";
			return getData;
		}
		
		@AfterTest
		public void after()
		{
			System.out.println("after test");
		}
		
		@Test(dataProvider = "data")
		public void second(String username, String password)
		{
			System.out.println(username);
			System.out.println(password);
			System.out.println("one more test");
		}	
	}

