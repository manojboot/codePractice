package com.collection.jan11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListExample1Jav8 {
	
		public static void main(String args[])
		{
			List<String> list = new ArrayList<String>();
			list.add("java");
			list.add("spring boot");
			list.add("spring mvc");
			list.add("java");
			list.add("collection");
			list.add("javascript");
			list.add("javascript");
			list.add("camunda");
			for(String s : list) {
				System.out.println(s);
			}
			System.out.println(list.stream().filter(s -> s.contains("s")).collect(Collectors.toList()));
			System.out.println(list.stream().distinct().collect(Collectors.toList()));
			System.out.println(list.stream().distinct().count());
			System.out.println(list.stream().map(String::toUpperCase).collect(Collectors.toList()));
		}

}
