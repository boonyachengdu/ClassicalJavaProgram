package com.boonya.url;

import org.junit.Test;

public class ShortURLByMD5Test {
	
	@Test
	public void testShortUrl(){
		System.out.println("=======================testShortUrl");
		String md5=ShortURLByMD5.md5("https://www.baidu.com");
		System.out.println("md5 string key:"+md5);
		
		String shortUrl=ShortURLByMD5.shortText(md5, 0);
		System.out.println("shortUrl="+shortUrl);
	}
	
	@Test
	public void testShortUrl2(){
		System.out.println("=======================testShortUrl2");
		String md5=ShortURLByMD5.md5("https://mall.jd.com/index-189415.html?qz_gdt=t3m5cwh6oiangpqadxda&utm_campaign=t_232310336_1&utm_term=t3m5cwh6oiangpqadxda&utm_medium=jzt-zhitou&utm_source=jdzt_refer_null");
		System.out.println("md5 string key:"+md5);
		
		String shortUrl=ShortURLByMD5.shortText(md5, 0);
		System.out.println("shortUrl="+shortUrl);
	}

}
