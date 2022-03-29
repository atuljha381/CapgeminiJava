package com.stud;

public class Sports extends Student {
	private String sptype;
	private int score;
	public Sports() {
		// TODO Auto-generated constructor stub
	}
	
	public Sports(int sno, String sname, String sptype, int score) {
		super(sno, sname);
		this.sptype = sptype;
		this.score = score;
	}

	public String getSptype() {
		return sptype;
	}
	public void setSptype(String sptype) {
		this.sptype = sptype;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.format("Sport Type: %s\nScore: %d",getSptype(),getScore());
	}

}
