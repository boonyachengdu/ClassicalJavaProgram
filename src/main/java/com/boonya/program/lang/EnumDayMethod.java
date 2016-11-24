package com.boonya.program.lang;

/**
 * 枚举星期日期方法类
 * 
 * @package com.boonya.program.lang.EnumDayMethod
 * @date   2016年11月17日  下午3:47:04
 * @author pengjunlin
 * @comment   
 * @update
 */
public enum EnumDayMethod {
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
	SAT(6) {
        @Override
        public boolean isFree() {
            return true;
        }
    },
    /**
	 * 星期日
	 */
    SUN(0) {
        @Override
        public boolean isFree() {
            return true;
        }
    };
 
    private int value;
 
    /**
   	 * 构造函数：私有构造
   	 */
    private EnumDayMethod(int value) {
        this.value = value;
    }
 
    public int getValue() {
        return value;
    }
 
    public boolean isFree() {
        return false;
    }

}
