package com.collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		
		List<Integer> ls= new ArrayList<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		
		Iterator<Integer> it=ls.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		ls.forEach(x-> System.out.println(x));
	
		List<Integer> ls2=new ArrayList<Integer>();
		Iterator<Integer> it2=ls2.iterator();
		it2.forEachRemaining(System.out:: println);
	
		
	}

}
