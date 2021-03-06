package com.prac.lambda;

public class AnonymousDemo {

	public static void main(String[] args) {
		// Anonymous Inner class
		/*
		 * Runnable r = new Runnable() {
		 * 
		 * @Override public void run() { for (int i = 0; i < 10; i++)
		 * System.out.println("Child Thread"); } };
		 */

		// Lambda Expression
		/*
		 * Runnable r = };
		 */
		Thread t = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread");
			}
		});
		t.start();
		for (int j = 0; j < 10; j++)
			System.out.println("Main Thread");
	}

}
