package com.java.test;

public enum Car {

	FORD(1, "Ford"),
	CHEVY(2, "Chevy"),
	KIA(3, "Kia");
	
	private int id;
	private String type;
	
	Car(int id, String type) {
		this.id = id;
		this.type = type;
	}
	
	public int id() {
		return id;
	}
	
	public String type() {
		return type;
	}
	
	public static Car fromId(Integer id) {
		if (id != null) {
			for (Car c : values()) {
				if (c.id == id) {
					return c;
				}
			}
		}
		return FORD; // default
	}
}
