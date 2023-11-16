package TestNG;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webTablePaginationWhileLoop {

	@Test
	public void test() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
		
		List<WebElement> rows =  driver.findElements(By.xpath("//table[@id=\"example\"]//tbody//tr//td[1]"));
		
		List<String> names = new ArrayList();
		for (WebElement row : rows) {
			names.add(row.getText());
		}

		String classatt = driver.findElement(By.id("example_next")).getAttribute("class");
		while(!classatt.contains("disabled")) {
			
			driver.findElement(By.id("example_next")).click();
			
			rows =  driver.findElements(By.xpath("//table[@id=\"example\"]//tbody//tr//td[1]"));
			
			for (WebElement row : rows) {
				names.add(row.getText());
			}
			classatt = driver.findElement(By.id("example_next")).getAttribute("class");
		}
		for (String name : names) {
			System.out.println(name);
		}
		int size = names.size();
		System.out.println("total size : "+size);
	
		String diaplaynamecount = driver.findElement(By.xpath("//div[@id=\"example_info\"]")).getText().split(" ")[5];
		System.out.println("displayed names : "+diaplaynamecount);
	
		assertEquals(diaplaynamecount, Integer.toString(size));
	
	
	
	
	
	
	}

}