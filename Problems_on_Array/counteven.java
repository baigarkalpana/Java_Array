/*
   Author:Kalpana Baigar
   program accepting Numbers and returns frequency of even Numbers using static method
 */

import java.util.*;
import java.util.Scanner;




public class Array
{
	public static void main(String []args)     //entry point function
	{
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size=sobj.nextInt();
		
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
		
		int cnt=0;
		
		for(int i=0;i<size;i++)
		{
			if(arr[i]%2==0)
			{
				cnt++;
				
			}
		}
		
		System.out.println("even numbers in an array is:"+cnt);		
		
		
	}
}


