package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoibiboTest {

	
	WebDriver driver;

@Given("^user navigate to Goibibo site$")

public void navigating() throws Throwable {
	
}



@Then("^User clicks on SIgn In Button$")
public void user_clicks_on_SIgn_In_Button() throws Throwable {
	
}
@When("^User enter username and password$")
public void user_enter_username_and_password() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^User click on login$")
public void user_click_on_login() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^User authentication will be successful$")
public void user_authentication_will_be_successful() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

}
