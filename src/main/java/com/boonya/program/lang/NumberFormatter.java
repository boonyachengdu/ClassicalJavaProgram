package com.boonya.program.lang;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class NumberFormatter {

	/**
	 * 获取规则的数字字符串:格式化为两位小数 ，不进行四舍五入
	 * 
	 * @MethodName: getFormatNumberStr
	 * @Description:
	 * @param v
	 * @return
	 * @throws
	 */
	public static String getFormatNumberStr(double v) {
		DecimalFormat df = new DecimalFormat("0.00");
		return df.format(v);
	}

	/**
	 * 获取规则的数字字符串:格式化为两位小数 ，不进行四舍五入
	 * 
	 * @MethodName: getFormatNumberStr2
	 * @Description:
	 * @param v
	 * @return
	 * @throws
	 */
	public static String getFormatNumberStr2(double v) {
		DecimalFormat df = new DecimalFormat("#.00");
		return df.format(v);
	}

	/**
	 * 获取规则的数字字符串:格式化为两位小数 ，进行四舍五入
	 * 
	 * @MethodName: getFormatNumberStr3
	 * @Description:
	 * @param v
	 * @return
	 * @throws
	 */
	public static String getFormatNumberStr3(double v) {
		String result = String.format("%.2f", v);
		return result;
	}

	/**
	 * 获取规则的数字:四舍五入法
	 * 
	 * @MethodName: getNumber
	 * @Description:
	 * @param v
	 * @return
	 * @throws
	 */
	public static double getNumber(double v) {
		BigDecimal b = new BigDecimal(v);
		// 保留2位小数
		double result = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		return result;
	}

}
