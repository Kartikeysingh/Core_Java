package com.prac.predicate;

import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {

		Predicate<Integer> p = i -> i > 10;
		System.out.println(p.test(100));
		System.out.println(p.test(5));

		Predicate<String> p2 = s -> s.length() > 5;
		System.out.println(p2.test("Kartikey"));
		System.out.println(p2.test("luv"));
	}

}
