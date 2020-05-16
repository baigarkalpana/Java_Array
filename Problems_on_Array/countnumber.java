/*
   Author:Kalpana Baigar
   program accepting Numbers and also accept one another number and checking frequency of that number using Inheritance
 */

import java.util.*;
import java.util.Scanner;



class math
{
	int i=0,count;
	public int check(int arry[],int length,int value) 
	   {
		  count=0;
		  for(i=0;i<length;i++)
		  {
			  if(arry[i]==value)
			  {
				  count++;
			  }
		  }
		   
	      return count; 
	   }
   
}




public class Array extends math
{
   public static void main(String[] args)
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
		System.out.println("enter another number:");
		int no=sobj.nextInt();
		
      Array a = new Array();
      int n;
      n=a.check(arr, size, no);     
      
      System.out.println("frequency of given number is:"+n);
     
   }
}


























