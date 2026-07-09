package com.collections.List;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		
		List al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add("Rajendra");
		System.out.println(al);
		int x=(Integer)al.get(0);
		System.out.println("Index is:"+x);
		
		String s=(String)al.get(3);
		System.out.println(s);

	}

}
