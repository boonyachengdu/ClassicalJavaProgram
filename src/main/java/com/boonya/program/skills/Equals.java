package com.boonya.program.skills;

import java.util.Calendar;
/**
 * 对象之间Equals类
 * 
 * @package com.boonya.program.skills.Equals
 * @date   2016年11月18日  下午2:35:12
 * @author pengjunlin
 * @comment   
 * @update
 */
public class Equals<T> {

	public static void equalsValue() {
		Point p1 = new Point(1, 2);
		Point p2 = new Point(1, 2);

		System.out.println(p1.equals(p2));
	}

	/**
	 * 值相等HashCode
	 */
	public static void equalsHashCode() {
		Point p1 = new Point(1, 2) {

			@Override
			public int hashCode() {
				return super.hashCode();
			}

		};
		Point p2 = new Point(1, 2) {

			@Override
			public int hashCode() {
				return super.hashCode();
			}

		};

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p1.hashCode() == p2.hashCode());
	}

	/**
	 * 原始HashCode
	 */
	public static void originalHashCode() {
		Point2 p1 = new Point2(1, 2);
		Point2 p2 = new Point2(1, 2);

		System.out.println(p1.hashCode() == p2.hashCode());
	}

	/**
	 * 判定是否能够进行对象比较
	 */
	public boolean canEqualsPoint(T t) {
		return (t instanceof Point);
	}

}

class Point {

	private final int x;
	private final int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public boolean equals(Object other) {
		boolean flag = false;
		// instanceof造型匹配
		if (other instanceof Point) {
			Point that = (Point) other;
			flag = (this.getX() == that.getX() && this.getY() == that.getY());
		}
		return flag;
	}

	@Override
	public int hashCode() {
		System.out.println("sin:" + Math.sin((this.x * 60) / this.y));
		double num = Math.abs(Math.sin((this.x * 60) / this.y) * 1000000000);
		System.out.println("factor:" + num);
		int tanFactor = (int) Math.abs(num);
		return Calendar.getInstance().getWeeksInWeekYear() * tanFactor
				* (x + y);
	}

}

class Point2 {

	private final int x;
	private final int y;

	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public boolean equals(Object other) {
		boolean flag = false;
		// instanceof造型匹配
		if (other instanceof Point) {
			Point that = (Point) other;
			flag = (this.getX() == that.getX() && this.getY() == that.getY());
		}
		return flag;
	}

}