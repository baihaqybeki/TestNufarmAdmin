package base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public static WebDriver driver;
	public static WebElement element = null;
	public static String Loginlink = "http://34.101.70.83:5100/auth/login";
	public static String Forgetlink = "http://34.101.70.83:5100/auth/forgot";
	
	public static void setup() {
		driver = new ChromeDriver();
		System.out.println("Opening...");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.getTitle();
	}

}
