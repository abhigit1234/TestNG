package FactoryAnnotation;

import org.testng.annotations.Factory;

public class FactoryAnnotation {
	/*
	 * its use to run same class multiple times by creating multiple instances of
	 * same class ie instances of same class
	 */	
	
	@Factory
	public Object[] factoryGenerator(){
		Object[] data = {new demo(),
				new demo(),new demo(),new demo()};
		return data;
	}
	

	
}
