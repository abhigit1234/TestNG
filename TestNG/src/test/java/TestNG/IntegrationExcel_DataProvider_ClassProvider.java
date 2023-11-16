package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestNG_Practice.demo;
import io.github.bonigarcia.wdm.WebDriverManager;

public class IntegrationExcel_DataProvider_ClassProvider {

	@Test(dataProvider = "data",dataProviderClass = DataProvider.class)
	public void data(Object[] s) throws InterruptedException {
		


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys((CharSequence)s[0]);
		driver.findElement(By.name("password")).sendKeys((CharSequence)s[1]);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(5000);
		driver.close();

	}
}