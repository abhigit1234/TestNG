package TestNG_Practice;

import static org.testng.Assert.assertEquals;

import javax.annotation.Tainted;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	@Test
	public void abhi() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://www.google.com");
	String act =	driver.getTitle();
	String exp = "google";
	assertEquals(act, exp);
	
	}
		
	
}
