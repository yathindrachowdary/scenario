package testpack;

//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import brwoser.utilityclass;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginFactor {
	WebDriver driver;
	@Given("^User must be registered$")
	public void user_must_be_registered() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver=utilityclass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/login.htm");
	}


@When("^login using username \"([^\"]*)\" and password \"([^\"]*)\"$")
public void login_using_username_and_password(String arg1, String arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	driver.findElement(By.name("userName")).sendKeys(arg1);
	driver.findElement(By.name("password")).sendKeys(arg2);
	driver.findElement(By.xpath("//input[@value='Login']")).click();
}


	@Then("^user shoild be in Home page$")
	public void user_shoild_be_in_Home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		WebDriverWait wait= new WebDriverWait(driver,50); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("products")));
		Assert.assertEquals(driver.getTitle(), "Home");
		System.out.println("Logged in Successfully !!");
		driver.close();
	}
	
}
