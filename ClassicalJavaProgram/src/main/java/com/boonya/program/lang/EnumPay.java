package com.boonya.program.lang;

/**
 * 支付枚举类
 * 
 * @package com.boonya.program.lang.EnumPay
 * @date   2016年11月17日  上午10:21:56
 * @author pengjunlin
 * @comment   
 * @update
 */
public enum EnumPay {
	/**
	 * Master支付
	 */
	MASTER_PAY("Master支付",0),
	/**
	 * Goolge支付
	 */
	GOOGLE_PAY("Goolge支付",1),
	/**
	 * 苹果支付
	 */
	APPLE_PAY("苹果支付",2),
	/**
	 * 银联支付
	 */
	UNION_PAY("银联支付",3),
	/**
	 * 支付宝支付
	 */
	ALI_PAY("支付宝支付",4),
	/**
	 * 微信支付
	 */
	WEIXIN_PAY("微信支付",5),
	/**
	 * 京东支付
	 */
	JD_PAY("京东支付",6),
	/**
	 * 百度支付
	 */
	BAIDU_PAY("百度支付",7),
	/**
	 * 其他支付
	 */
	OTHER_PAY("其他支付",8);
	
	/**
	 * 构造函数：私有构造
	 */
	private EnumPay(String name,int state){
		this.name=name;
		this.state=state;
	}
	
	private String name;
	
	private int state;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	
}
