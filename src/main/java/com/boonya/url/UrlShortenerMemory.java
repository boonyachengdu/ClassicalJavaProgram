package com.boonya.url;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/**
 * 内存存储的实现 
 * 
 * @package com.boonya.url.UrlShortenerMemory
 * @date   2017年3月22日  上午11:29:29
 * @author pengjunlin
 * @comment   
 * @update
 */
public class UrlShortenerMemory extends AbstractUrlShortener {
	
    private Map<String, String> url2ShortUrl = new ConcurrentHashMap<String, String>();
    
    private Map<String, String> shortUrl2Url = new ConcurrentHashMap<String, String>();

    public UrlShortenerMemory() {
        super();
    }

    public UrlShortenerMemory(int length) {
        super(length);
    }

    public void put(String url, String shortUrl) {
        url2ShortUrl.put(url, shortUrl);
        shortUrl2Url.put(shortUrl, url);
    }

    public String seek(String shortUrl) {
        return shortUrl2Url.get(shortUrl);
    }

    public void clean(String url) {
        String sortUrl = url2ShortUrl.get(url);
        if (sortUrl != null) {
            url2ShortUrl.remove(url);
            shortUrl2Url.remove(sortUrl);
        }
    }

    public void clean(Date date) {
        throw new UnsupportedOperationException();
    }

}
