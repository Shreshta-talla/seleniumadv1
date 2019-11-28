package testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void login() {
	  System.out.println("login success");
	  
  }
  @Test(priority=1)
  public void f() {
	  System.out.println("test priority");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("open the url");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("logout the application");
	  
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("open the browser");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("close the browser");
  }
	  @BeforeMethod
	  public void beforemethod() 
	  {
		  System.out.println("before method");
  }

	@AfterMethod  
	public void aftermethod() 
	  {
		  System.out.println("after method");
}
	  
}
