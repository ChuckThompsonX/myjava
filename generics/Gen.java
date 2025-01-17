package com.java.generics;

public class Gen<T> {

	T ob;
	
	public Gen(T ob) {
		this.ob = ob;
	}

	T getOb() {
		return this.ob;
	}
	
	void showType() {
		System.out.println(this.ob.getClass().getName());
	}
}
