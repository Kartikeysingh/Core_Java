package com.prac.defaultandstaticmethods;

public interface Left {

	default void m1() {
		System.out.println("Left default method implementation");
	}
}
