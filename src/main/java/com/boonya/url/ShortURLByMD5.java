package com.boonya.url;

import java.security.MessageDigest;

public class ShortURLByMD5 {

	private ShortURLByMD5() {
		
	}

	/** 短链接可选字符 */
	private final static char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
			.toCharArray();
	
	/** md5的char值 */
	private final static char[] md5chars = "1234567890EADCBF".toCharArray();
	
	/** 30位的long类型数值,右移运算可以达30 */
	static long max = Long.parseLong("3FFFFFFF", 16);
	
	/** 61的最大值以便于从chars中选择字符 */
	static long min = Long.parseLong("0000003D", 16);

	public static String shortText(String md5, int start) {
		/** 短链接返回数据 */
		StringBuilder returnValue = new StringBuilder();
		String subHex = md5.substring(start * 8, (start + 1) * 8);
		/** 获取字串运算索引 */
		long idx = max & Long.parseLong(subHex, 16);
		/** 获取6位数的短码，6*5=30 */
		for (int k = 0; k < 6; k++) {
			int index = (int) (min & idx);
			returnValue.append(chars[index]);
			idx = idx >> 5;
		}
		return returnValue.toString();
	}

	/**
	 * md5
	 * 
	 * @param s
	 * @return
	 */
	public final static String md5(String s) {
		try {
			byte[] btInput = s.getBytes();
			/** 获得MD5摘要算法的 MessageDigest 对象 */
			MessageDigest mdInst = MessageDigest.getInstance("MD5");
			/** 使用指定的字节更新摘要 */
			mdInst.update(btInput);
			/** 获得密文 */
			byte[] md = mdInst.digest();
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				str[k++] = md5chars[byte0 >>> 4 & 0xf];
				str[k++] = md5chars[byte0 & 0xf];
			}
			return new String(str);
		} catch (Exception e) {
			return null;
		}
	}

}
