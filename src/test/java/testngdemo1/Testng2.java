package testngdemo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testng2 {
	
	WebDriver driver;
	 
		 	 
	  @Test
	  public void popupdemo() {
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  //WebDriverWait wait=new WebDriverWait(driver,30);
	 // driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		  driver.findElement(By.name("userName")).sendKeys("tutorial");
//		  driver.findElement(By.name("password")).sendKeys("tutorial");
//		  driver.findElement(By.name("login")).click();
		  driver.findElement(By.xpath("/html/body/div[1]/form/input")).submit();
		  String alertMessage = driver.switchTo().alert().getText();
		  driver.switchTo().alert().accept();
		 
		System.out.println(alertMessage);
		 // driver.close();
	  }
	 

}
