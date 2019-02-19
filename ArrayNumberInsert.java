package com.Array1D;
import java.util.*;
public class ArrayNumberInsert   //Insert a Number In Array list With Given Position
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Elements:");
		int a=sc.nextInt();
		
		int b[]=new int[20];
		System.out.println("Array Elements Are");
		
		for(int i=0;i<a;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("Enter New Array Element want to Insert:");
		int c=sc.nextInt();
		System.out.println("Enter the position you want to Insert in the Array List");
		int d=sc.nextInt();
		
		for(int i=a;i>d;i--)
		{
			b[i]=b[i-1];
		}
		
		b[d]=c;
		a++;
		
		System.out.println("Final Array List:");
		for(int i=0;i<a;i++)
		{
			System.out.print(b[i]+" ");
		}

	}

}
