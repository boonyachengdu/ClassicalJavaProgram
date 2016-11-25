package com.boonya.annotation;

import org.junit.Test;

public class AppleTest {
	
	@Test
	public void testNull(){
		Apple apple=new Apple();
		System.out.println(apple.toString());
	}
	
	
	@Test
	public void testObjectValues(){
		Apple apple=new Apple();
		apple.setColor(FoodColor.Color.GREEN.name());
		apple.setName("Apple");
		System.out.println(apple.toString());
	}

}
