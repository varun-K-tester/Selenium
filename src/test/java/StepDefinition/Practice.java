package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Practice {
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   System.out.println("step1");
	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
		   System.out.println("step2");

	}

	@And("User clicks on login button")
	public void user_clicks_on_login_button() {
		   System.out.println("step3");

	}

	@Then("User is naviagted to homepage")
	public void user_is_naviagted_to_homepage() {
		System.out.println("step4");
	}	   

}
