package com.example.genric23_2020;

import java.util.Arrays;
import java.util.List;

public class UniqueElements {
		public static void main(String[] args) {
				
			Integer []a2 = {1, 3, 4, 4, 4};
			Integer []a1 = {2, 5, 7};
			List<Integer> list1 = Arrays.asList(a1);
			List<Integer> list2 = Arrays.asList(a2);
			int primitive[] = list1.stream().mapToInt(Integer::intValue).toArray();
			for(int i=0;i<a1.length;i++)
			{
				System.out.println(primitive[i]);
			}
			int count = (int) list1.stream().distinct().count();
			System.out.println(count);
		}
}	
