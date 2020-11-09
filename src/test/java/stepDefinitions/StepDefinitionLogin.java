package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionLogin {
	
	   @Given("^I am on the login page$")
	    public void i_am_on_the_login_page() throws Throwable {
		   System.out.println("LOG :: 1st Step >>> ");
	       
	    }

	    @When("^I enter login credentials$")
	    public void i_enter_login_credentials() throws Throwable {
	    	System.out.println("LOG :: 2nd Step >>> ");
	        
	    }

	    @Then("^I am on the homepage$")
	    public void i_am_on_the_homepage() throws Throwable {
	    	System.out.println("LOG :: 4th Step >>> ");
	    }

	    @And("^I click on submit$")
	    public void i_click_on_submit() throws Throwable {
	    	System.out.println("LOG :: 3rd Step >>> ");
	       
	    }


}
