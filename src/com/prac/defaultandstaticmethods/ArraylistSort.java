package com.prac.defaultandstaticmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ArraylistSort {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(0);
		list.add(20);
		list.add(15);
		list.add(2);
		Predicate<Integer> p = i -> i > 10;
		System.out.println(p.test(100));
		System.out.println(p.test(3));

		Collections.sort(list, (I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);
		ArrayList<Integer> l2 = (ArrayList<Integer>) list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(l2);
	}

}
