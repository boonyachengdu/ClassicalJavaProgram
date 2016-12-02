package com.boonya.program.lang;

import org.junit.Test;

public class NumberFormatterTest {
	
	@Test
	public void test(){
	
		double v=89234.925;
		
		System.out.println(NumberFormatter.getFormatNumberStr(v));
		
		System.out.println(NumberFormatter.getFormatNumberStr2(v));
		
		System.out.println(NumberFormatter.getFormatNumberStr3(v));
		
		System.out.println(NumberFormatter.getNumber(v));
		
	}

}
