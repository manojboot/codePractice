package com.example.genric23_2020;

public class Merge2Arrays {
	
		public static void main(String[] args) {
			
				int a[] = {1,4,9,16,25,36,49};
				int b[] = {81,100,2500,225,400,256};
				int c[] = new int[a.length + b.length];
				int count = 0;
				for(int i=0;i<a.length;i++)
				{
					c[i]=a[i];
					count++;
				}
				for(int j=0;j<b.length;j++)
				{
					c[count++]=b[j];
					System.out.println(b[j]);
				}
				for(int j=0;j<c.length;j++)
				{
					System.out.print(c[j] +" ");
				}
				
		}

}
