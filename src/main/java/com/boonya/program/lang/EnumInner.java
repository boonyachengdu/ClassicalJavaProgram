package com.boonya.program.lang;

/**
 * 内部枚举类
 * 
 * @package com.boonya.program.lang.EnumInner
 * @date   2016年11月17日  下午3:46:56
 * @author pengjunlin
 * @comment   
 * @update
 */
public class EnumInner {
	
	/**
	 * 定义内部枚举：颜色
	 * 
	 */
	public enum Color {
	    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET;
	}
	
	/**
	 * 定义内部枚举：状态
	 * 
	 */
	public static  enum State {
		/**
		 * 正常态
		 */
        Normal("正常态", 1),
        /**
         * 已更新
         */
        Update("已更新", 2),
        /**
         * 已删除
         */
        Deleted("已删除", 3),
        /**
         * 已屏蔽
         */
        Fired("已屏蔽", 4);
        
        // 成员变量
        private String name;
        
        // 成员变量
        private int state;

        /**
    	 * 构造函数：私有构造
    	 */
        private State(String name, int state) {
            this.name = name;
            this.state = state;
        }

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
}
