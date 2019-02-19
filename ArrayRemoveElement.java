package com.Array1D;
import java.util.*;
public class ArrayRemoveElement  //Removing an Array in given Index Number.
{

	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,50,60};
		System.out.println("Original Array ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		int removeIndex=0;
		System.out.println(" ");
		System.out.println("New Array List After Removing Element");
		for(int i=removeIndex;i<a.length-1;i++)
		{
			a[i]=a[i+1];
			System.out.print(a[i]+" ");
		}
	}

}
