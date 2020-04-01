package com.example.genric23_2020;

import java.util.Scanner;

public class MinimumRemovalForEvenSum {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int sum = 0;
			int a[] = new int[n];
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i] +" ");
			}
			for(int i=0;i<a.length;i++)
			{
				sum = sum + a[i];
			}
			System.out.println();
			System.out.println(sum);
			if(sum%2==0)
			{
				System.out.println("No removal");
			}
			else {
				System.out.println("1 Removal");
			}
			String str = "("+a[0]+a[1]+a[2]+")";
			System.out.println(str);
		}

}
