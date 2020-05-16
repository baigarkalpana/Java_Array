/*
   Author:Kalpana Baigar
   program accepting Numbers from user and return index of last occurence of number
 */

import java.util.*;
import java.util.Scanner;



class math
{

	void check(int arry[],int length,int value) 
	   {
		int cnt=0;
		  for(int i=0;i<length;i++)
		  {
			  if(arry[i]==value)
			  {
                   cnt=i;
				   
			  }
			  
		  }
		  System.out.println("Number"+" "+value+" "+"present at index:"+cnt);
		  
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
		System.out.println("enter another number:");
		int no=sobj.nextInt();
		
      math a = new math();
      
       a.check(arr, size, no);     
      
     
   }
}


























