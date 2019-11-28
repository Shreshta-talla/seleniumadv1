package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import LibraryFunctions.Browserfactory;
import Pages.login;

public class logintestcase {
  @Test
  public void test() {
	  WebDriver driver=Browserfactory.startBrowser("firefox", "http://demoaut.com/");
	  login log=new login(driver);
	  log.loginuser("tutorial", "tutorial");
	  
	  
  }
}
