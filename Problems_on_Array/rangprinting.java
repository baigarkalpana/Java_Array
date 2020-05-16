/*
   Author:Kalpana Baigar
   program accepting Numbers from user and printing numbers which present in range only
 */

import java.util.*;
import java.util.Scanner;



class math
{

	void check(int arry[],int length,int str,int end1) 
	   {
		int cnt=0;
		 System.out.println("numbers are:");
		  for(int i=0;i<length;i++)
		  {
			  if((arry[i]>=str)&&(arry[i]<=end1))
			  {
				  System.out.println(arry[i]+" ");
				   
			  }
			  
		  }
		 
		  
	   }
   
}




class Array 
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
		System.out.println("enter starting range:");
		int start=sobj.nextInt();
		
		System.out.println("enter ending range:");
		int end=sobj.nextInt(); 
		
        math a = new math();
      
       a.check(arr, size, start,end);     
      
     
   }
}


























