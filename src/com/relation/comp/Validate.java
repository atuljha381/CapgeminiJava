package com.relation.comp;

public abstract class Validate {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public abstract boolean Validator();
}
