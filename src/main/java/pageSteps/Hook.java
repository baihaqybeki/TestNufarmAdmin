package pageSteps;

import base.BasePage;
import io.cucumber.java.After;

public class Hook extends BasePage{
	
	@After
	public void quit() {
		System.out.println("Exiting...");
//		driver.quit();
	}

}
