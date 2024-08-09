package TestNG_Practice;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo {

	@Test
	public void abhi() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://www.google.com");
	String act =	driver.getTitle();
	String exp = "google";
	assertEquals(act, exp);
	
	}
		
	
}
