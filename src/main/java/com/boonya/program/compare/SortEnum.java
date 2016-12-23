package com.boonya.program.compare;
/**
 * 排序类型枚举
 * 
 * @package com.boonya.program.compare.SortEnum
 * @date   2016年12月23日  上午10:58:44
 * @author pengjunlin
 * @comment   
 * @update
 */
public enum SortEnum {
	
	/**
	 * 升序
	 */
	ASC(0),
	/**
	 * 降序
	 */
	DESC(1);
	
	private int value=0;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	private SortEnum(int value) {
		this.value = value;
	}
	
	

}
