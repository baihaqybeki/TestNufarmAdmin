package pageSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddProductCategory;

public class AddProductCategorySteps {
	
	private static AddProductCategory addProductCategory = AddProductCategory.getInstance();
	
	@Given("^Start driver for addproductcategory$")
	public void startdriver() {
		addProductCategory.startdriver();
	}
	
	@When("^navigate url for addproductcategory$")
	public void navigateurl() {
		addProductCategory.navigateurl();
	}
	
	@And("^login for addproductcategory$")
	public void login() {
		addProductCategory.login();
	}
	
	@And("^click product category tab$")
	public void clickProductCategory() {
		addProductCategory.clickProductCategory();
	}
	@And("^click add category product button$")
	public void addButton() {
		addProductCategory.addButton();
	}
	
	@And("^fill name category \"([^\"]*)\"$")
	public void fillNameField(String categoryName) {
		addProductCategory.fillNameField(categoryName);
	}
	
	@And("^upload file \"([^\"]*)\"$")
	public void uploadImageField(String path) {
		addProductCategory.uploadImageField(path);
	}
	
	@And("^fill the description$")
	public void fillDescription() {
		addProductCategory.fillDescription();
	}
	
	@And("^click add button$")
	public void clickAddButton() {
		addProductCategory.clickAddButton();
	}
	
	@And("^close pop up$")
	public void closePopup() {
		addProductCategory.closePopup();
	}
	
	@And("^get current link after add category product$")
	public void getLink() {
		addProductCategory.getlink();
	}
	
	@Then("^to validate add product category move to page$")
	public void linkcheck() {
		addProductCategory.linkcheck();
	}
}
