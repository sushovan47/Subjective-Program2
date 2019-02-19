package com.Array1D;
import java.util.*;
public class ArrayNumberPresent   //Checking a Number Is Present in Array List not using Linear Search .
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Values");
		int a[]=new int[6];
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the Value Want to Check:");
		int c=sc.nextInt();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==c)
			{
				count++;	
			}
		}
		if(count==1)
		{
			System.out.println("The Value is Present in The Array List");
		}
		else
		{
			System.out.println("The Value is not Present in the Array List");
		}
	}
		

}


