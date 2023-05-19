package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("^User is on Login page$")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("log in page");
	    throw new io.cucumber.java.PendingException();    
	}

	@When("^User enters (.+) and (.+)$")
	public void user_enters_manoj_and_manoj123() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("entering login credentials");
	    throw new io.cucumber.java.PendingException();
	}

	@And("^Click on Login button$")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("click on login button");
	    throw new io.cucumber.java.PendingException();
	}

	@Then("^User navigated to the Home page.$")
	public void user_navigated_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("home page");
	    throw new io.cucumber.java.PendingException();
	}
	
	
}
