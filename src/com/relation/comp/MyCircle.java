package com.relation.comp;

public class MyCircle extends Diagram {
	private int radius;
	
	
	public MyCircle(int xc, int yc, int radius) {
		super(xc, yc);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("Radius: "+this.getRadius());
	}
}
