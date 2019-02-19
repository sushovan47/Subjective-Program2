package com.Array1D;
import java.util.*;
public class ArrayRemoveElement1    //Checking A Particular Element is Deleteed from Array List
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Array Elements:");
		int a=sc.nextInt();
		int count=0;
		int arr[]=new int[20];
		
		System.out.println("Array Elements Are:");
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the Value you Want to Remove from the Array list");
		int b=sc.nextInt();
		
		for(int i=0;i<a;i++)
		{
			if(arr[i]==b)
			{
				for(int j=i;j<a-1;j++)
				{
					arr[j]=arr[j+1];
				}
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("Element Not Found in Array List");
		}
		else
		{
			System.out.println("Element Deleted Successfully...!!");
		}
		System.out.println("New Array List");
		for(int i=0;i<a-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		

	}

}
