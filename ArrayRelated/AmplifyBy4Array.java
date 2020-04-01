package com.example.genric23_2020;

import java.util.Scanner;

public class AmplifyBy4Array {
		public static void main(String[] args) {
			
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				int a[] = new int[n];
				int j=1;
				for(int i=0;i<a.length;i++,j++)
				{	
					a[i]=j;
					if(a[i]%4==0)
					{
						a[i]=j*10;
					}
				}
				for(int i=0;i<a.length;i++)
				{
					System.out.println(a[i]);
				}
		}
}
