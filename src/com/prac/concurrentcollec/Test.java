package com.prac.concurrentcollec;

import java.util.concurrent.ConcurrentHashMap;

public class Test {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> m = new ConcurrentHashMap<>();
		m.put(101, "Durga");
		m.put(102, "Shiva");
		m.putIfAbsent(101, "Parvati");
		m.remove(101, "Sati");
		m.replace(102, "Shiva", "Bholenath");
		System.out.println(m);
	}

}
