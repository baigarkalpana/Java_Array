/*
   Author:Kalpana Baigar
   program accepting Numbers and display such a numbers which are divisible by 5 
   using interface
 */

import java.util.*;
import java.util.Scanner;


interface math
{
    void display();
}


class Number implements math
{   
   void display(int arr1[],int num)
	{
		 int i;
			for(i=0;i<6;i++)
			{
				if(arr1[i]%5==0)
				{
					System.out.println("divisible by 5:"+arr1[i]);
					
					
				}
				else
				{
					System.out.println("not divisible by 5:"+arr1[i]);
				}
			}
	}
	
	
	
	public static void main(String args[])
	{
	
	
 	
		   int arr[]=new int[6];
		   int i;
		   System.out.println("enter elements in an array");
		   Scanner sobj=new Scanner(System.in);
		   for(i=0;i<6;i++)
		   {
		      arr[i]=sobj.nextInt();	   
			   
		   }
		   System.out.println("your entered elements in an array is:");
		   for(i=0;i<6;i++)
		   {
			   System.out.println(arr[i]);   
			   
		   }
		   
		  Number x=new Number();
		  x.display(arr,6);
		   
      }   
}

