/*
   Author:Kalpana Baigar
   program to check array contain specific element or not
 */

import java.util.Scanner;


class math
{
	
   void display (int Arr[],int size,int no)
	{
	   int count = 0;
		for(int i=0;i<size;i++)
		{
			if(Arr[i]==no)
			{
				//System.out.println("number is present");
			     count=1;
			}
		}
		
		if(count==1)
		{
			System.out.println("number is present");
		}
		else
		{
			System.out.println("number is not present");
		}
	}
	 
	 
	 
}


class Number
{
	public static void main(String args[]) //entry point function
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter size of an array");
		int size=sobj.nextInt();
		int []arr;
		arr=new int[size];
		System.out.println("enter elements in an array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sobj.nextInt();
		}
		System.out.println("entered elements are:");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i] + "\t");
			//System.out.println(arr[i]);
		}
	
		System.out.println("enter number");
		int num=sobj.nextInt();
		
		
        math obj=new math();
        obj.display(arr,size,num);
		
		
	}
	
	
	 
	
	
}
