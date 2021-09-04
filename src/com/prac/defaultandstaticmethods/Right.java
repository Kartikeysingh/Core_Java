package com.prac.defaultandstaticmethods;

public interface Right {

	default void m1() {
		System.out.println("Right Default method implementation");
	}

}
