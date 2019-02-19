package com.Array1D;
import java.util.*;
public class NNumberArrayCheck   //N Number Array Value Reading And Display
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Values:");
		
		int a[]=new int[6];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("==========After Reading the Array Values========");
		for(int j=0;j<a.length;j++)
		{
			System.out.println("The Array Values Are:"+a[j]);
		}

	}

}
