package com.Array1D;
import java.util.ArrayList;
import java.util.Collections;
public class ArraySmallest		//Checking the Smallest Number from an Array List
{
	public static void main(String[] args)
	{
		ArrayList<Integer> li =new ArrayList<Integer>();
		
		li.add(-97);
		li.add(45);
		li.add(54);
		li.add(0);
		li.add(-675);
		li.add(-3);
		li.add(-65);
		
		System.out.println("The Smallest Number in the Given Array List is:"+Collections.min(li));

	}

}
