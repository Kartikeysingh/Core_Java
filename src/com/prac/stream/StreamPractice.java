package com.prac.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(13);
		list.add(15);
		list.add(2);
		list.add(23);
		list.add(43);
		list.add(26);

		TreeSet<Integer> ts = new TreeSet<>((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
		ts.add(10);
		ts.add(0);
		ts.add(5);
		ts.add(12);
		ts.add(12);
		ts.add(32);
		ts.add(24);

		System.out.println(ts);

		/*
		 * Two Process a stream there are theo steps: 1. Configuration --> Filter
		 * Mechanism(used to filter the collection based on some logic.) or Map
		 * Mechanism(Used to create a new mapped object based on some function.) 2.
		 * Processing
		 */

		// Filter Mechanism
		Stream<Integer> s1 = list.stream().filter(i -> i % 2 == 0);
		long count = list.stream().filter(i -> i % 2 == 0).count();
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		List<Integer> descSortedList = list.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(count);
		System.out.println(sortedList);
		System.out.println(descSortedList);

		// Map Mechanism
		Stream<Integer> s2 = list.stream().map(i -> i * 2);

		ArrayList<String> hero = new ArrayList<>();
		hero.add("Kartikey");
		hero.add("Amitabh");
		hero.add("Hrithik");
		hero.add("Ravi Teja");
		hero.add("Venkatesh");

		System.out.println(hero);

		List<String> l1 = hero.stream().filter(s -> s.length() >= 8).collect(Collectors.toList());
		System.out.println(l1);

		List<String> l2 = hero.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l2);

		System.out.println(10 + 20 + "Kartikey");
		System.out.println("Kartikey" + 10 + 20);
	}

}
