package com.Array1D;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayLargest    //Checking the Largest Number From an Array List
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> li=new ArrayList<Integer>();
		
		li.add(987);
		li.add(765);
		li.add(78);
		li.add(-675);
		li.add(0);
		
		System.out.println("The Larget Number in the Given Array List is:"+Collections.max(li));
		

	}

}
