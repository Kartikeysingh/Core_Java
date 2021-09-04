package com.prac.lambda;

public class LambdaExpressionPrac {

	public static void main(String[] args) {

		Interf i = s -> s.length();
		System.out.println(i.textLength("Kartikey"));

	}

}
