package com.boonya.program.lang;

import java.math.BigDecimal;

import org.junit.Test;

public class BigDecimalTest {
	
	private static double a = 2.00;
	
	private static double b = 1.10; 
	
	@Test
	public void testSubstract0(){
		System.out.println("method=testSubstract0>:"+(a - b));// 输出0.8999999999999999
	}
	
	@Test
	public void testSubstract1(){
		BigDecimal a1=new BigDecimal(a);
		BigDecimal b1=new BigDecimal(b);
		double result=a1.subtract(b1).doubleValue();
		System.out.println("method=testSubstract1>:"+result);// 输出0.8999999999999999
	}
	
	@Test
	public void testSubstract2(){
		BigDecimal a1=new BigDecimal(Double.valueOf(a));
		BigDecimal b1=new BigDecimal(Double.valueOf(b));
		double result=a1.subtract(b1).doubleValue();
		System.out.println("method=testSubstract2>:"+result);// 输出0.8999999999999999
	}
	
	@Test
	public void testSubstract3(){
		BigDecimal a1=new BigDecimal(Double.toString(a));
		BigDecimal b1=new BigDecimal(Double.toString(b));
		double result=a1.subtract(b1).doubleValue();
		System.out.println("method=testSubstract3>:"+result);// 输出0.9
	}
	
	
	@Test
	public void testAll() throws IllegalAccessException{
		System.out.println(BBigDecimal.add(a, b));// 3.1
		System.out.println(BBigDecimal.add(a, b,2));// 3.1
		System.out.println(BBigDecimal.subtract(a, b));// 0.9
		System.out.println(BBigDecimal.subtract(a, b,2));// 0.9
		System.out.println(BBigDecimal.multiply(a, b));// 2.2
		System.out.println(BBigDecimal.multiply(a, b,2));// 2.2
		System.out.println(BBigDecimal.divide(a, b,5));// 1.81818
	}

}
