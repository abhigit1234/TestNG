package TestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo{
	
	@Test
	public void launch() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com");
		driver.findElement(By.id("gh-ac")).sendKeys("samsung mobile",Keys.ENTER);
		String act =  driver.findElement(By.name("_sacat")).getText();
		String exp = "Cell Phones & Smartphones";
		assertEquals(act,exp);
		
		String act1 = driver.findElement(By.id("gh-as-a")).getText();
		String exp1 = "advanced";
		assertEquals(act1, exp1);
		driver.close();
	
		String act2 = driver.findElement(By.id("gh-p-2")).getText();
		String exp2 = "Sell";
		assertEquals(act2, exp2);
	}
	
	
	
}