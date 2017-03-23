package com.boonya.url;

import org.junit.Test;

public class UrlShortenerTest {
	
	@Test
	public  void test() {
		// 生成URL长度
        for(int j=1;j<10;j++) {
            UrlShortener urlShortener = new UrlShortenerMemory(j);
            // 生成次数
            for (int i = 0; i < 5; i++) {
            	// 有待改进的地方===希望同一个url生成的串是一致的而不是随机变化,转成唯一算法即可
                System.out.println(urlShortener.get("https://www.baidu.com"));
            }
            System.out.println();
        }
    }
	
	///////////////////改进方案//////////////////
	// 1、创建一个URL映射表 存储url（唯一字段）      并返回自增ID
	// 2、对返回的自增ID进行Base64编码处理，提供对外访问接口地址隐射
	// 3、根据base64解码找到原始的URL进行301跳转
	// 3、Java内部进行301跳转
			/*response.setStatus(301);
			response.setHeader("Location","http://www.baidu.com");
			//---分割线---
			response.sendRedirect("http://baidu.com");*/
	
}
