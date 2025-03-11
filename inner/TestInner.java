package com.java.inner;

public class TestInner {

	public static void main(String... args) {
		OuterClass st = new OuterClass();
		OuterClass.InnerClass fl = st.new InnerClass();
        	fl.methodInFirstLevel(23);
	}
}
