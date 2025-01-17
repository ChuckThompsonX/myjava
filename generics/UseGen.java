package com.java.generics;

public class UseGen {

	void usesGen(Gen<?> g) {
		g.showType();
	}
	
	void usesGenAgain(Gen<String> g) {
		g.showType();
	}
}
