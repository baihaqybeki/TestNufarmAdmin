package pageSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.ForgetPassword;

public class ForgetPasswordStep {
	
	private static ForgetPassword forgetPassword = ForgetPassword.getInstance();
	
	@Given("^Start driver for forgetpassword$")
	public void startdriver() {
		forgetPassword.startdriver();
	}
	
	@When("^navigate url to forgetpassword$")
	public void navigateurl() {
		forgetPassword.navigaeturl();
	}
	
	@And("^enter email in forgetpassword \"([^\"]*)\"$")
	public void enteremail(String email) {
		forgetPassword.enteremail(email);
	}
	
	@And ("^enter button in forgetpassword$")
	public void enterbutton() {
		forgetPassword.enterbutton();
	}

}
