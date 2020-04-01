package com.example.genric23_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayDuplicateRemove {
		
			public static void main(String[] args) {
				
				Integer a[] = {12, 34, 45, 9, 8, 90, 3,12,45,12};
				List<Integer> list= Arrays.asList(a);
				System.out.println(list);
				Set<Integer> set = new HashSet<Integer>(list);
				List<Integer> list1 = new ArrayList<Integer>(set);
				Collections.sort(list1);
				System.out.println(list1);
				Object[] b = list1.toArray();
				for(int i=0;i<b.length;i++)
				{
					System.out.println(b[i]);
				}
				int b1[] = {3,10,3};
				int maxNum = b1[0];
				for(int i=0;i<b1.length;i++)
				{
					if(b1[i]>maxNum)
					{
						maxNum=b1[i];
					}
				}
				System.out.println("Max Number :" +maxNum);
				int count = 0;
				for(int i=0;i<b1.length;i++)
				{
					count = count + (maxNum - b1[i]);
				}
				System.out.println(count);
			}
}
