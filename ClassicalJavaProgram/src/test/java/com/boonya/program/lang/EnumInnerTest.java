package com.boonya.program.lang;

import org.junit.Test;

public class EnumInnerTest {
	
	@Test
	public void testEnum(){
		System.out.println("name="+EnumInner.State.Normal.getName()+", State="+EnumInner.State.Normal.getState());
		System.out.println(EnumDay.WED+" "+EnumPay.GOOGLE_PAY);
	}

}
