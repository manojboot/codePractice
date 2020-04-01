package com.example.genric23_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShortHandArrayString {
		public static void main(String[] args) {
			List<String> list= new ArrayList<String>();
			list = Arrays.asList(str);
			System.out.println(list);
			Collections.sort(list);
			System.out.println(list);
			char ch[] = new char[str.length];
			for(int i=0;i<str.length;i++)
			{
				ch[i]=str[i].charAt(0);
			}
			String s1 = new String(ch);
			System.out.println(s1);
		}
}	
