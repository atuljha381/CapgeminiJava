package com.relation.comp;

public class Diagram {
	private int xc,yc;
	

	public Diagram(int xc, int yc) {
		super();
		this.xc = xc;
		this.yc = yc;
	}

	public int getXc() {
		return xc;
	}

	public void setXc(int xc) {
		this.xc = xc;
	}

	public int getYc() {
		return yc;
	}

	public void setYc(int yc) {
		this.yc = yc;
	}
	public void show() {
		System.out.println("X-coord: "+this.getXc()+" Y-coord: "+this.getYc());
	}
}
