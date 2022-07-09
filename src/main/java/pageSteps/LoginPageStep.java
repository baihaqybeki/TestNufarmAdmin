package pageSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageStep {
	
	private static LoginPage loginPage = LoginPage.getInstance();
	
	@Given("^Start driver$")
	public void startdriver() {
		loginPage.startdriver();
	}

	@When("^navigate url to login$")
	public void navigateurl() {
		loginPage.navigateurl();
	}

	@And("^enter email \"([^\"]*)\"$")
	public void enteremail(String email) {
		loginPage.enteremail(email);
	}
	
	@And("^enter password \"([^\"]*)\"$")
	public void enterpassword(String password) {
		loginPage.enterpassword(password);
	}
	
	@And("^enter button$")
	public void enterbutton() {
		loginPage.enterbutton();
	}
	
	@And("^get current link login$")
	public void getlink() {
		loginPage.getlink();
	}
	
	@Then("^to validate login move to page \"([^\"]*)\"$")
	public void linkcheck(String expectLink) {
		loginPage.linkcheck(expectLink);
	}
	

}
