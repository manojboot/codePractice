package com.example.genric23_2020;

import java.util.Arrays;

public class ArrayIncrementToTop {
		
			public static void main(String[] args) {
				int arr[] = {3, 4, 4};
				int count = 0;
				int maxNum = arr[0];
				for(int i=0;i<arr.length;i++)
				{
					if(arr[i]>maxNum)
					{
						maxNum=arr[i];
					}
				}
				System.out.println(maxNum);
				Arrays.sort(arr);
				for(int i=0;i<arr.length;i++)
				{	
					for(int j=i;j<arr.length;j++)
					{
						if(arr[i]==arr[j])
						{
							count=0;
						}
						else if(arr[j]!=maxNum)
						{
							count++;
						}
					}
				}
				System.out.println(count);
			}
}
