package LibraryFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserfactory {
	static WebDriver driver;
	public static WebDriver startBrowser(String browsername,String url) {
		if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecho.driver","C:\\Selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;

}
}