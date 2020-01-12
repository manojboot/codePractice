package com.collection.jan11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListExample2Java8 {
	
		public static void main(String args[])
		{
			List<Integer> list = new ArrayList<Integer>();
			list.add(10);
			list.add(99);
			list.add(45);
			list.add(69);
			list.add(27);
			list.add(991);
			list.add(45);
			list.add(21);
			System.out.println(list.stream().distinct().collect(Collectors.toList()));
			System.out.println(list.stream().max(Comparator.comparing(String::valueOf)).get());
			System.out.println(list.stream().map(i-> i*i).collect(Collectors.toList()));
		}

}
