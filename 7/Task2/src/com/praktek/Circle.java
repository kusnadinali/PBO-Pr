package com.praktek;

public class Circle extends Shape{
	private double radius;
	
	public Circle() {
		super();
		setRadius(1.0);
	}
	public Circle(double radius) {
		super();
		this.setRadius(radius);
	}
	public Circle(double radius,String color,boolean filled) {
		super(color,filled);
		this.setRadius(radius);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
	public double getPerimeter() {
		return radius*2*Math.PI;
	}
	public String toString() {
		return "Circle[ "+super.toString()+", radius= "+radius+"]";
	}
}
