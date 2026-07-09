package com.collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayVSArrayList {

	public static void main(String[] args) {

		int[] arr1 = new int[3];

		ArrayList<Integer> al = new ArrayList<Integer>();

		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		System.out.println(Arrays.toString(arr1));
		System.out.println(al);
		int x = al.size();
		System.out.println(x);

		al.remove(0);
		System.out.println(al);

		al.remove(new Integer(30));
		System.out.println(al);

		ArrayList<Integer> al2 = new ArrayList<Integer>();
		System.out.println(al2.isEmpty());
		
		int x1=al.lastIndexOf(new Integer (40));
		System.out.println(x1);

		Collections.sort(al);
		System.out.println(al);
		
		Collections.reverse(al);
		System.out.println(al);
	}

}
