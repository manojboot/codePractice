package com.example.genric23_2020;

public class ArrayTranspose {
	
			public static void main(String[] args) {
				
				int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
				int b[][] = new int[a.length][a.length];
				for(int i=0;i<a.length;i++)
				{
					for(int j=0;j<a.length;j++)
					{
						System.out.print(a[i][j] +" ");
					}
					System.out.println();
				}
				System.out.println();
				for(int i=0;i<a.length;i++)
				{
					for(int j=0;j<a.length;j++)
					{
						b[i][j] = a[j][i];
						System.out.print(b[i][j] +" ");
					}
					System.out.println();
				}
			}

}
