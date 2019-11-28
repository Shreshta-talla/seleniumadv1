package testngdemo1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class testmedemo {
  @Test
  public void moveto() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm#"); 
	  WebElement aboutus=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/a/span"));
	  WebElement ouroffice=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span"));
	  WebElement Banglore=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/ul/li[2]/a/span"));
	  Actions act=new Actions(driver);
	  act.moveToElement(aboutus).click().build().perform();
	  WebDriverWait wait=new WebDriverWait(driver,70);
	  wait.until(ExpectedConditions.elementToBeClickable(ouroffice));
	  act.moveToElement(ouroffice).click().build().perform(); 
	  wait.until(ExpectedConditions.elementToBeClickable(Banglore));
	  act.moveToElement(Banglore).click().build().perform();
	  String parentwindowid=driver.getWindowHandle();
		
	  Set<String> set=driver.getWindowHandles();
	  		for(String s:set)
	  		{
	  			driver.switchTo().window(s);
	  		}
	  		driver.switchTo().frame(driver.findElement(By.name("main_page")));
	  		//driver.switchTo().frame("main_page");
	  		String address=driver.findElement(By.tagName("address")).getText();
	  		System.out.println(address);
	  		driver.quit();
	  
  }
}
