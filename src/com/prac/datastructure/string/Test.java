package com.prac.datastructure.string;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "geeksforgeeks";
		String str2 = "geeksforgeeks";
		String str3 = new String("geeksforgeeks");

		System.out.println(str == str2);
		System.out.println(str == str3);

		System.out.println(str.length());
		System.out.println(str.charAt(3));
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 12));

		String str4 = "GeeksForGeeks";
		System.out.println(str.contains(str4));
		System.out.println(str.equals(str4));

		String str5 = "Gor";

		System.out.println(str4.compareTo(str5));

	}

}
