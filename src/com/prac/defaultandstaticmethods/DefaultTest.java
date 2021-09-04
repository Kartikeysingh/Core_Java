package com.prac.defaultandstaticmethods;

public class DefaultTest implements Left, Right {

	public static void main(String[] args) {

		DefaultTest test = new DefaultTest();
		test.m1();
	}

	@Override
	public void m1() {
		// Left.super.m1();
		Right.super.m1();
	}

}
