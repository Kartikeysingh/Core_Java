package com.prac.recursion;

public class PracRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracRecursion test = new PracRecursion();
		int n = 5;
		test.print1ton(n);
		System.out.println(test.sum(5));
	}

	private void print1ton(int n) {
		if (n == 0)
			return;
		print1ton(n - 1);
		System.out.print(n + " ");
	}

	private int sum(int n) {
		if (n == 1)
			return 1;
		return n + sum(n - 1);
	}
}
