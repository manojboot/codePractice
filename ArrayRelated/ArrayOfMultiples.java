package com.example.genric23_2020;

public class ArrayOfMultiples {
	
	public static void main(String[] args) {
		
				int a[] = {1,2,3,5,8,9};
				int b[] = {20,13,56,91};
				int c[] = new int[a.length+b.length];
				int j = 0;
				for(int i=0;i<a.length;i++)
				{
					c[i]=a[i];
					j++;
				}
				for(int i=0;i<b.length;i++,j++)
				{
					c[j]=b[i];
				}
				for(int i=0;i<c.length;i++)
				{
					System.out.println(c[i]);
				}
	}		
}
