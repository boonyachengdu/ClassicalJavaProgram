package com.boonya.program.lang;

import org.junit.Test;

public class BigDecimalTest {
	
	@Test
	public void test() throws IllegalAccessException{
		double a = 2.00;
		double b = 1.10; 
		System.out.println(a - b);// 输出0.8999999999999999

		System.out.println("\n\n");
		System.out.println(BBigDecimal.add(a, b));// 3.1
		System.out.println(BBigDecimal.add(a, b,2));// 3.1
		System.out.println(BBigDecimal.subtract(a, b));// 0.9
		System.out.println(BBigDecimal.subtract(a, b,2));// 0.9
		System.out.println(BBigDecimal.multiply(a, b));// 2.2
		System.out.println(BBigDecimal.multiply(a, b,2));// 2.2
		
		System.out.println(BBigDecimal.divide(a, b,5));// 1.81818
	}

}
