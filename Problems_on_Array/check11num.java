/*
   Author:Kalpana Baigar
   program accepting Numbers and check number 11 is present or not using method
 */

import java.util.*;
import java.util.Scanner;



class Array

{
	 static void check(int array[],int num,int value)
	{
		 int j=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==value)
			{
				 j=1;
			}
		
		}
		if(j==1)
		{
		  System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
		
	}
		
	
public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size=sobj.nextInt();
		int no=11;
		
		int arr[]=new int[size];             //array object creation
		
		System.out.println("enter elements in an array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sobj.nextInt();
		}
		
		System.out.println("your entered elements are:");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		
	   check(arr,size,no);

	}
}
