package com.collection.jan11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListExaple3Java8 {
	
		public static void main(String args[])
		{
			List<Student> list = Arrays.asList(new Student("mayank",31,19),
					new Student("mayank",31,19),
					new Student("abhinav",2,18),
					new Student("sumith",52,19),
					new Student("neha",36,18));
			
			List<String> list1 = list.stream().map(x->x.getName()).collect(Collectors.toList());
			System.out.println(list1);
		}
}
