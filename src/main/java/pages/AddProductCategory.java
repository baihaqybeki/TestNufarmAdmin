package pages;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BasePage;

public class AddProductCategory extends BasePage{
	
	private static AddProductCategory instance;
	
	public static synchronized AddProductCategory getInstance() {
		if (instance == null)
			instance = new AddProductCategory();
		return instance;
	}
	
	public void startdriver() {
		BasePage.setup();
	}
	
	public void navigateurl() {
		driver.get(Loginlink);
	}
	
	public void login() {
		driver.findElement(By.id("email")).sendKeys("dev01@bestada.co.id");
		driver.findElement(By.id("password")).sendKeys("SssOoo*01");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/form/div[4]/button")).click();
	}
	
	public void clickProductCategory() {
		WebElement catalog = new WebDriverWait(driver,Duration.ofSeconds(30))
		        .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[1]/a[4]/div/div")));
		catalog.click();
		
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/a/div[1]")).click();
	}
	
	public void addButton() {
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div[1]/a/div/button")).click();

	}
	
	public void fillNameField(String categoryName) {
		element = driver.findElement(By.id("name"));
		element.sendKeys(categoryName);

	}
	
	public void uploadImageField(String path) {
		element = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/form/div/div[1]/div[2]/div/div/input"));
		element.sendKeys(path);
	}
	
	public void fillDescription() {
		element = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/form/div/div[2]/div/div/div[4]/div[1]"));
		element.sendKeys("Contoh deskripsi pada kategori produk");
	}
	
	
	public void clickAddButton() {
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		element = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/form/div/div[3]/div[2]/button"));
		element.click();
	}
	
	public void closePopup() {
		try {
			Thread.sleep(660);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		element = driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button"));
		element.click();
		
//		WebElement close = new WebDriverWait(driver,Duration.ofSeconds(600))
//		        .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div[4]/div/button")));
//				
//				close.click();
	}
	
	public String getlink() {
		String actualLink = driver.getCurrentUrl();
		return actualLink;
	}
	
	public void linkcheck() {
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String expectLink = "http://34.101.70.83:5100/product_category";
		String actual = this.getlink();
		assertEquals(actual, expectLink);
	}


}
