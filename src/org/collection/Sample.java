package org.collection;

import java.util.ArrayList;
import java.util.List;

public class Sample {

	
	public static void main(String[] args) {

		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		System.out.println(li);
		
		//no.of value in list 
		int si = li.size();
		System.out.println(si);
		
		//fetch particular value based on index
		Integer j = li.get(3);
		System.out.println(j);
		Integer i1 = li.get(4);
		System.out.println(i1);
		
		//add value of particular index
		li.add(2,60);
		System.out.println(li);
		li.add(4,90);
		System.out.println(li);
		
		//remove value in given index
		li.remove(3);
		System.out.println(li);
		
		//replace value 
		li.set(3,70);
		System.out.println(li);
		
		//verify value is present or not
		boolean bo = li.contains(40);
		System.out.println(bo);
		
		//to find index position
		int in = li.indexOf(20);
		System.out.println(in);
		
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
				
		}
		{
		System.out.println("*******");
		}
		for (Integer x : li) {
			System.out.println(x);
		}
			
		}
		
	



		
		
		
		
	}
	

