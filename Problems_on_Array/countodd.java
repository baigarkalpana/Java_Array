/*
   Author:Kalpana Baigar
   program accepting Numbers and returns frequency of odd Numbers using static constructor
 */

import java.util.*;
import java.util.Scanner;


class number
{
	int cnt=0,i,num=0;
	number(int arr1[],int size1)
	{
		for(i=0;i<size1;i++)
		{	
			if(arr1[i]%2!=0)
			{
			   cnt++;
			}
		}
		
	}
}

class Array
{
	public static void main(String args[])
	 {
		    Scanner sobj=new Scanner(System.in);
			System.out.println("Enter size of an array");
			int size=sobj.nextInt();
			
			int arr[]=new int[size];
			
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
			
	        number obj=new number(arr,size);	
	        
	        System.out.println("frequency of odd number is:"+obj.cnt);
	 
	 }
}





















