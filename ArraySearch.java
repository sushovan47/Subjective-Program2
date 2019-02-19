package com.Array1D;
import java.util.*;
public class ArraySearch   //Checking Value in Present or Not In Array List.
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements");
		int a[] =new int[7];
		int i,j;
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("Enter the Value you Want to Search:");
		int b=sc.nextInt();
		for(j=0;j<a.length;j++)
		{
			if(a[j]==b)
			{
				System.out.println("The Value is Present in the Array List");
				break;
			}
		}

	}

}
