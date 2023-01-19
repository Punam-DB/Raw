package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Actistep {
	WebDriver driver;
	@Given("Browser open")
	public void browser_open() {
	    System.setProperty("webdriver.chrome.driver","");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}

	@Given("User is on Login Page")
	public void user_is_on_login_page() {
	   driver.get("https://demo.actitime.com/login.do"); 
	}

	@When("User enter valid UN and valid PWD")
	public void user_enter_valid_un_and_valid_pwd() {
         driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
	}

	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}

	@Then("User should land on Homepage")
	public void user_should_land_on_homepage() {
		 String expT = "Enter Time-Track";
		    String actT = driver.findElement(By.xpath("//td[text()='Enter Time-Track']")).getText();
		    
		    if(actT.equals(expT)) {
		    	System.out.println("User Navigated to Homepage");
		    }
		    else {
		    	System.out.println("TC is failed");
		    }
	}


}
