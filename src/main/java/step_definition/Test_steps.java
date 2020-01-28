package step_definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_steps {

	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {
		System.out.println("User is on Home Page");
		
	 
	}

	@When("User Navigate to LogIn page")
	public void user_Navigate_to_LogIn_page() {
		System.out.println("User Navigate to LogIn page");
	   
	}

	@When("User enters Username and Password")
	public void user_enters_Username_and_Password() {
		System.out.println("User enters Username and Password");
		   
		
	    
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_Login_Successfully() {
		System.out.println("Message displayed Login Successfully");
		   
	    
	}

	@When("User Logout from the Application")
	public void user_Logout_from_the_Application() {
		System.out.println("User Logout from the Application");
		   
	   
	}

	@Then("Message displayed Logout Successfully")
	public void message_displayed_Logout_Successfully() {
	System.out.println("Message displayed Logout Successfully");
	   
    
	}

}
