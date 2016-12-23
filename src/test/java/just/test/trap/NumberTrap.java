package just.test.trap;

import org.junit.Test;

public class NumberTrap {

	/**
	 * 对于精确答案的地方，要尽量避免使用float和double；对于货币计算，要使用int,long和BigDecimal，并且使用
	 * BigDecimal时千万不要使用BigDecimal(double)构造函数。
	 * 
	 * @MethodName: doubleCount
	 * @Description:
	 * @throws
	 */
	@Test
	public void doubleCount() {
		System.out.println(2.00 - 1.10);// 0.8999999999999999
	}

	/**
	 * 长整除：当你操作很大的数字时，千万要提防溢出
	 * 
	 * @MethodName: millisCount
	 * @Description:
	 * @throws
	 */
	@Test
	public void millisCount() {
		long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
		long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
		System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);// 5

		long MICROS_PER_DAY2 = 24L * 60 * 60 * 1000 * 1000;
		long MILLIS_PER_DAY2 = 24L * 60 * 60 * 1000;
		System.out.println(MICROS_PER_DAY2 / MILLIS_PER_DAY2);// 1000
	}

	/**
	 * 基本类型的转型操作
	 * 
	 * @MethodName: byteToIntCount
	 * @Description:
	 * @throws
	 */
	@Test
	public void byteToIntCount() {
		System.out.println((int) (char) (byte) -1);// 65535
	}

	
	/**
	 * 类型溢出错误
	 * 
	 * @MethodName: maxInteger 
	 * @Description: 
	 * @throws
	 */
	@Test
	public void maxInteger(){
		long x=Integer.MAX_VALUE+1;
		System.out.println(x);//-2147483648
	}
	
	/**
	 * 类型溢出错误
	 * 
	 * @MethodName: maxLong 
	 * @Description: 
	 * @throws
	 */
	@Test
	public void maxLong(){
		Number i=Long.MAX_VALUE;
		System.out.println(i.intValue()>0);//false
	}
	
	/**
	 * round取值问题
	 * 
	 * @MethodName: round 
	 * @Description: 
	 * @throws
	 */
	@Test
	public void round(){
		System.out.println(Math.round(11.5));//返回（long）12，
		System.out.println(Math.round(-11.5));//返回（long）-11;
	}

}
