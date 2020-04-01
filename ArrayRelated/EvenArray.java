package com.example.genric23_2020;

import java.util.ArrayList;
import java.util.List;

public class EvenArray {
		public static void main(String[] args) {
			
			int nums[] = {34, 66, 23, 89, 53, 9, 6};
			List<Integer> list = new ArrayList<Integer>();
			for(int i=0;i<nums.length;i++)
			{
					if(nums[i]%2==0)
					{
						list.add(nums[i]);
					}
					
			}
			int[] even = list.stream()
					.mapToInt(Integer::intValue)
					.toArray();
			for(int i=0;i<even.length;i++)
			{
					System.out.println(even[i]);
					
			}
		}
}
