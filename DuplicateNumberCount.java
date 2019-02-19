package com.Array1D;
public class DuplicateNumberCount   //Checking Repeating Value|Duplicate Values of the Array List 
{
	public static void main(String[] args)
	{
		int a[]= {10,20,30,40,10,30,60};
		
		System.out.println("Repetead Values Are:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					System.out.print(a[i]+" ");		
			}		
				
		}
	}

}
