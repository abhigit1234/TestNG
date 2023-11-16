package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider_String_Integer_Object {
//=================Integer
	
	@Test(dataProvider = "loginpage")
	public void LoginPage(Integer a) {
		System.out.println(a);
	}

	@DataProvider()
	public Integer[] loginpage() {
		Integer[] data = new Integer[] { 1,2,3,4,5 };

		return data;

	}

	
//====================  Jagged array =========	

	@Test
	public void log() {
		String[][] data = {{"a","b"},{"c","d","e","f"}};
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j]+" ");
			}System.out.println();
		}
	}

	
//================================== String
	
//	@Test(dataProvider = "loginpage")
//	public void LoginPage(String a) {
//		System.out.println(a);
//	}
//
//	@DataProvider()
//	public String[] loginpage() {
//		String[] data = new String[] { "abhi", "babu", "durgu", "alash", };
//
//		return data;
//
//	}

	
//========================== Object can use for all formats
	
	//	@Test(dataProvider = "loginpage")
//	public void LoginPage(Object a) {
//		System.out.println(a);
//	}
//
//	@DataProvider()
//	public Object[] loginpage() {
//		Object[] data = new Object[] { 758, "babu", 123, "lash", };
//
//		return data;
//
//	}
}
