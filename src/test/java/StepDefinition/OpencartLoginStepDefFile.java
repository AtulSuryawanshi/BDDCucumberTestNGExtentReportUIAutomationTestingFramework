package StepDefinition;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpencartLoginStepDefFile {

	@Given("^User navigate to Opencart website$")
	public void user_navigate_to_opencart_website() throws Throwable {
		System.out.println("This step executed in background");
		System.out.println("User navigate to Opencart website");
	}

	@When("^User click on MyAccount dropdown$")
	public void user_click_on_myaccount_dropdown() throws Throwable {
		System.out.println("User click on MyAccount dropdown");
	}

	@When("^User click on Login button$")
	public void user_click_on_login_button() throws Throwable {
		System.out.println("User click on Login button");
	}

	@Then("^User should see Login and Register buttons$")
	public void user_should_see_login_and_register_buttons() throws Throwable {
		System.out.println("User should see Login and Register buttons");
	}

	@Then("^User should navigate to Opencart Login page$")
	public void user_should_navigate_to_opencart_login_page() throws Throwable {
		System.out.println("User should navigate to Opencart Login page");
	}

	@When("^User enters (.+) and (.+)$")
	public void user_enters_and(String username, String password) throws Throwable {

		System.out.println("Username: " + username);
		System.out.println("Password: " + password);

	}

	@Then("^User should navigate to Login success page$")
	public void user_should_navigate_to_login_success_page() throws Throwable {
		System.out.println("User should navigate to Login success page");
	}

	@When("^User enters below details$")
	public void user_enters_below_details(DataTable data) throws Throwable {
		
	System.out.println("I am inside the: User enter details step file");
	
		List<String> objList = data.asList();
		System.out.println("User First Name: "+objList.get(0));
		System.out.println("User Last Name: "+objList.get(1));
		
		
	}

}
