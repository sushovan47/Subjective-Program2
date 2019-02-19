package com.Array1D;
public class ArrayOccurNumber 		//Checking Array List Repeted Value And Occurence Position.
{
	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,10,30,40,10};
		int b=10;
		int c=30;
		int d=40;
		int count=0,count1=0,count2=0;
		System.out.println("The Array List is:----");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b)
				count++;
			else if(a[i]==c)
				count1++;
			else if(a[i]==d)
				count2++;
			System.out.println(a[i]+" ");
			
		}
		
		System.out.println("10 Repeated in the Array List"+count+ " times");
		System.out.println("30 Repeated in the Array List"+count1+ " times");
		System.out.println("40 Repeated in the Array List"+count2+ " times");

	}

}
