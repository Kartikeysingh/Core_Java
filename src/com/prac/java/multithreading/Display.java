package com.prac.java.multithreading;

public class Display {

	public synchronized void display(String name) {

		for (int i = 0; i < 10; i++) {
			System.out.print("Good Morning: ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {

			}
			System.out.println(name);
		}
	}

}
