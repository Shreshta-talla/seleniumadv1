import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demostepdef {
	String Expectedresult="Find a Flight: Mercury Tours:";
	@Given("^enduser is our login page$")
	public void enduser_is_our_login_page() throws Throwable {
		System.out.println("enduser is our login page");
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("http://demoaut.com/");
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^enduser enters the valid credentials and click on submit button$")
	public void enduser_enters_the_valid_credentials_and_click_on_submit_button() throws Throwable {
	   System.out.println("enduser enters the valid credentials and click on submit button");
	   driver.findElement(By.name("userName")).sendKeys("tutorial");
		  driver.findElement(By.name("password")).sendKeys("tutorial");
		  driver.findElement(By.name("login")).click();
		
		// Write code here that turns the phrase above into concrete actions
		
		    throw new PendingException();
	}

	@Then("^user does successful login$")
	public void user_does_successful_login() throws Throwable {
		System.out.println("user does successful login");
		Assert.assertEquals(Expectedresult,driver.getTitle());
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
