package com.example.genric23_2020;

import java.util.Arrays;

public class StringAlphabeticalOrder {
			
				public static void main(String[] args) {
					
					String str = "welcome";
					char ch[] = str.toCharArray();
					Arrays.sort(ch);
					String st = new String(ch);
					System.out.println(st);
					String s1 = "1/2";
					long x = 7109376*7109376;
					System.out.println(x);
					String card = "35123413355523";
					String s12 = card.substring(0,card.length()-4);
					for(int i=0;i<s12.length();i++)
					{
						s12=s12.replace(s12.charAt(i),'*');
					}
					s12=s12+card.substring(card.length()-4,card.length());
					System.out.println(s12);
				}
				
}
