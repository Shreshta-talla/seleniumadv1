package testngdemo05;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;

	
//	 @BeforeClass
//	 		 
//		 public void beforeClass() {
//			  System.setProperty("webdriver.firefox.driver","C:\\Selenium\\geckodriver.exe");
//			  WebDriver driver=new FirefoxDriver();
//
//			  driver.get("http://demoaut.com/"); 
//	  }	
//	
	
  @Test
  public void login() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();

	  driver.get("http://demoaut.com/"); 
	  driver.findElement(By.name("userName")).sendKeys("tutorial");
	  driver.findElement(By.name("password")).sendKeys("tutorial");
	  driver.findElement(By.name("login")).click();
  }
	  

//  @AfterClass
//  public void afterClass() {
//  
//	  driver.close();
//	  
//  }
  

}
