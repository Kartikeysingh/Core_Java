package com.prac.function;

import java.util.function.Consumer;
import java.util.function.Function;

public class TestFunction {

	public static void main(String[] args) {
		String s = "Hello World I am back";
		// Calculate length of a string entered.
		Function<String, Integer> f1 = s1 -> s1.length();
		System.out.println(f1.apply(s));
		System.out.println(f1.apply("Kartikey Singh"));

		// Calculate the number of whitespaces in a string.
		Function<String, Integer> f2 = s2 -> s2.length() - s2.replaceAll(" ", "").length();
		System.out.println(f2.apply(s));
		System.out.println(f2.apply("Kartikey Singh"));
	}

}
