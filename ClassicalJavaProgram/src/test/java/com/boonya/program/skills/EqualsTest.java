package com.boonya.program.skills;

import org.junit.Test;

public class EqualsTest {
	
	@Test
	public void testEqualsValue(){
		Equals.equalsValue();
	}
	
	@Test
	public void testEqualsHashCode(){
		Equals.equalsHashCode();
	}
	
	@Test
	public void testOriginalHashCode(){
		Equals.originalHashCode();
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test
	public void testCanEqualsPoint(){
		Point p=new Point(1, 2);
		System.out.println(new Equals().canEqualsPoint(p));
		
		
		Object obj=new Object();
		System.out.println(new Equals().canEqualsPoint(obj));
	}

}
