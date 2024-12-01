package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo{
	
	@Test
	public void launch() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:90/opencart/upload/admin");
		System.out.println("abhilash babu durgumahanthi");
		

}
	
	
	
}