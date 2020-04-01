package com.example.genric23_2020;

import java.util.Scanner;

public class ArrayAbsoluteSum {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i] +" ");
			}
			int sum = 0;
			for(int i=0;i<a.length;i++)
			{
				sum = sum + Math.abs(a[i]);
			}
			System.out.println("Absolute sum :" +sum);
		}

}
