package com.relation.comp;

public class Box extends Diagram {
	private int width,height;
	public Box(int xc, int yc,int width, int height) {
		super(xc, yc);
		// TODO Auto-generated constructor stub
		this.width = width;
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public void show() {
		super.show();
		if(width==height) {
			System.out.println("This is square");
		}
		else {
			System.out.println("This is rectangle");
		}
		System.out.println("Width is: "+this.getWidth()+" Height is: "+this.getHeight());
	}

}
