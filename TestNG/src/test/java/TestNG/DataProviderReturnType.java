package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderReturnType {

	@Test(dataProvider = "data")
	
	public void test(String[] a) {
		System.out.println(a[0]+" "+a[1]+" "+a[2]);
	}

	@DataProvider
	public String[][]  data() {
		String[][] arr = {{"abhi","naidu","hyderabad"},{"hash","babu","london"}};	
		return arr;
	}

}