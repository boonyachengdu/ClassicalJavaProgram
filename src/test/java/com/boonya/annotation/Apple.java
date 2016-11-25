package com.boonya.annotation;

import java.io.Serializable;

import com.boonya.annotation.FoodColor.Color;

public class Apple implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3484719553056061153L;

	@FoodName(value="Apple")
	private String name;
	
	@FoodColor(value=Color.RED)
	private String color;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Apple [name=" + name + ", color=" + color + "]";
	}
	

}
