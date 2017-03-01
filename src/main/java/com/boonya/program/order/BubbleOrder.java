package com.boonya.program.order;
/**
 * 冒泡排序：数组升序和降序(原理:错位比较大小)
 * 
 * @package com.boonya.program.order.BubbleOrder
 * @date   2017年3月1日  下午1:50:43
 * @author pengjunlin
 * @comment   
 * @update
 */
public class BubbleOrder {

	/**
	 * 冒泡排序:升序
	 * 
	 * @MethodName: asc
	 * @Description:
	 * @param a
	 * @return
	 * @throws
	 */
	public static int[] asc(int a[]) {
		int temp = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		return a;
	}

	/**
	 * 冒泡排序:倒序
	 * 
	 * @MethodName: desc
	 * @Description:
	 * @param a
	 * @return
	 * @throws
	 */
	public static int[] desc(int a[]) {
		int temp = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] <= a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		return a;
	}

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 5, 4 };
		
        System.out.println("ACS:");
		BubbleOrder.asc(a);
		
		System.out.println("DECS:");
		BubbleOrder.desc(a);

	}

}
