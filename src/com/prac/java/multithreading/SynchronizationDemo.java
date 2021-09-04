package com.prac.java.multithreading;

public class SynchronizationDemo {

	public static void main(String[] args) {

		Display d1 = new Display();
		Display d2 = new Display();
		MyThread t1 = new MyThread(d1, "Kartikey");
		MyThread t2 = new MyThread(d2, "Dushyant");

		t1.start();
		t2.start();
	}

}
