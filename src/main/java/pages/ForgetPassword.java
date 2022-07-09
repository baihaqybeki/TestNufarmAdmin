package pages;

import org.openqa.selenium.By;

import base.BasePage;

public class ForgetPassword extends BasePage{
	
	private static ForgetPassword instance;
	
	public static synchronized ForgetPassword getInstance() {
		if (instance == null) 
			instance = new ForgetPassword();
		return instance;
	}
	
	public void startdriver() {
		BasePage.setup();
	}
	
	public void navigaeturl() {
		driver.get(Forgetlink);
	}
	
	public void enteremail (String email) {
		element = driver.findElement(By.id("email"));
		element.sendKeys(email);
	}
	
	public void enterbutton() {
		element = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/form/div[2]/button"));
		element.click();
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
