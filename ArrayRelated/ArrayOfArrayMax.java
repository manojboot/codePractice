package com.example.genric23_2020;

public class ArrayOfArrayMax {
		
			public static void main(String[] args) {
				
				int arr[][] = {{4, 2, 7, 1}, {20, 70, 40, 90}, {1, 2, 0}};
				int maxNum1 = arr[0][0];
				int maxNum2 = arr[1][0];
				int maxNum3 = arr[2][0];
				int a[]= new int[arr.length];

				for(int i=0;i<arr.length;i++)
				{
					for(int j=0;j<arr.length;j++)
					{
							if(arr[i][j]>maxNum1)
							{
								maxNum1=arr[i][j];
							}
							else if(arr[i][j]>maxNum2)
							{
								maxNum2=arr[i][j];
							}
							else if(arr[i][j]>maxNum3) {
								maxNum3=arr[i][j];
							}
							
					}
				}
				a[0] = maxNum1;a[1] = maxNum2;a[2] = maxNum3;
				for(int i=0;i<a.length;i++)
				{
					System.out.println(a[i]);
				}
				System.out.println(maxNum1 +" " +maxNum2 +" " +maxNum3);
			}
}
