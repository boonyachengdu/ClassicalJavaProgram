package just.test;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.junit.Test;

public class JSONTest {
	
	@SuppressWarnings("unchecked")
	@Test
	public void test(){
		JSONObject json=new JSONObject();
		json.put("name", "boonya");
		json.put("age", "25");
		System.out.println(json.toJSONString());
	}
	
	@Test
	public void test2(){
		String json="{"+"\"name"+"\""+":"+"\"boonya"+"\""+","+"\"age"+"\""+":"+"\"25"+"\"}";
		JSONObject jsonObj=(JSONObject) JSONValue.parse(json);
		System.out.println(jsonObj.toJSONString());
	}

}
