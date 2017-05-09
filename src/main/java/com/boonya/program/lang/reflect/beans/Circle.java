package com.boonya.program.lang.reflect.beans;

public class Circle extends Shape {

	@SuppressWarnings("unused")
	private void drawCircle() {
		System.out.println("drawCircle");
	}

	public int getAllCount() {
		return 100;
	}

}
