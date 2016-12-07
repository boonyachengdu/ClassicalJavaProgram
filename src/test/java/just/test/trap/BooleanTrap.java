package just.test.trap;

import org.junit.Test;

public class BooleanTrap {
	
	/**
	 * 使用条件操作符最好是使用类型相同的第二和第三操作数
	 * 
	 * @MethodName: testJudge
	 * @Description:
	 * @throws
	 */
	@Test
	public void testJudge() {
		char x = 'X';
		int i = 0;
		System.out.println(true ? x : 0);//X
		System.out.println(false ? i : x);//88
	}
	
	/**
	 * 理所当然的错误
	 * 
	 * @MethodName: testBooleanValue 
	 * @Description: 
	 * @throws
	 */
	@Test
	public void testBooleanValue(){
		boolean flag = Boolean.getBoolean("true");
		System.out.println(flag);//false
		
		
		String b="true";
		
		System.out.println(Boolean.valueOf(b));//true
		
		System.out.println(Boolean.parseBoolean(b));//true
	}

}
