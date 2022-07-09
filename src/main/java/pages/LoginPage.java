package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import base.BasePage;

public class LoginPage extends BasePage{
	
	private static LoginPage instance;
	
	public static synchronized LoginPage getInstance() {
		if (instance==null) 
			instance = new LoginPage();
		return instance;
	}
	
	public void startdriver() {
		BasePage.setup();
	}
	
	public void navigateurl() {
		driver.get(Loginlink);
	}
	
	public void enteremail(String email) {
		element = driver.findElement(By.id("email"));
//		element.sendKeys("dev01@bestada.co.id");
		element.sendKeys(email);
	}
	
	public void enterpassword(String password) {
		element = driver.findElement(By.id("password"));
//		element.sendKeys("SssOoo*01");
		element.sendKeys(password);
	}
	
	public void enterbutton() {
		element = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/form/div[4]/button"));
		element.click();
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public String getlink() {
		String actualLink = driver.getCurrentUrl();
		return actualLink;
	}
	
	public void linkcheck(String expectLink) {
		String actual = this.getlink();
		assertEquals(actual, expectLink);
	}
	
}
