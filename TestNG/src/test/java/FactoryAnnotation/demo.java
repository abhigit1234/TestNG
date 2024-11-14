package FactoryAnnotation;

import org.testng.annotations.Test;

public class demo {
	@Test
	public void oneTest() {
		System.out.println("@ factory annotation "+ " thread count " +Thread.currentThread().threadId());
	}
}
