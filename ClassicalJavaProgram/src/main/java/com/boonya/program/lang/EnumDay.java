package com.boonya.program.lang;
/**
 * 枚举星期日期类
 * 
 * @package com.boonya.program.lang.EnumDay
 * @date   2016年11月17日  下午3:47:38
 * @author pengjunlin
 * @comment   
 * @update
 */
public enum EnumDay {
	/**
	 * 星期一
	 */
	MON(1),
	/**
	 * 星期二
	 */
	TUE(2),
	/**
	 * 星期三
	 */
	WED(3),
	/**
	 * 星期四
	 */
	THU(4),
	/**
	 * 星期五
	 */
	FRI(5),
	/**
	 * 星期六
	 */
	SAT(6),
	/**
	 * 星期日
	 */
	SUN(0);
 
    private int value;
 
    /**
	 * 构造函数：私有构造
	 */
    private EnumDay(int value) {
        this.value = value;
    }
 
    public int getValue() {
        return value;
    }
 
    public boolean isFree() {
        return false;
    }

}
