/*
   Author:Kalpana Baigar
    program to printing difference of summation of even odd elements in an array
 */

import java.lang.*;
import java.util.Scanner;   


class Number
{
	public static void main(String args[]) //entry point function
	{
		int num=0; 
		int i=0;
		Scanner s=new Scanner(System.in); 
		System.out.println("enter size of array :");
		num=s.nextInt();
        
		int arr[];
		arr=new int[num];
		
		System.out.println("enter elements :");
		
		for(i=0;i<num;i++)
		{ 
        	arr[i]=s.nextInt();

	    }	
		System.out.println("entered elements is :");
		
		for(i=0;i<num;i++)
		{ 
        	
        	System.out.println(arr[i]);

	    }	
		
		 int sumevn=0,sumodd=0,ret;

		 for(i=0;i<num;i++)
		   {
		   	   if(arr[i]%2==0)
		   	   {
		   	     sumevn=sumevn+arr[i];	  
			   }
		   	   else if(arr[i]%2!=0 )
			   {
			   	  sumodd=sumodd+arr[i];	  
			   }
		   }
		    ret=sumevn-sumodd;
System.out.println("difference of summation of odd and even elements is :"+ret);
		
		
		
		
		
		
		
		
	}
	 
	
	
}
