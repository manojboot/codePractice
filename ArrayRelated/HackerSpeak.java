package com.example.genric23_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HackerSpeak {
	
		public static void main(String[] args) {
			
				String str = "javascript is cool";
				str = str.replace('a', '4');
				str = str.replace('e', '3');
				str = str.replace('i', '1');
				str = str.replace('o', '0');
				str = str.replace('s', '5');
				System.out.println(str);
				
				String s[] = {"welcome","mike","jack","rafale"};
				List<String> list = new ArrayList<String>();
				
				for(int i=0;i<s.length;i++)
				{
					if(s[i].length()==4)
					{
						list.add(s[i]);
					}
				}
				System.out.println(Arrays.asList(list));
				String st1r[] = new String[s.length];
				String[] array = list.toArray(new String[0]);
				
				for(int i=0;i<array.length;i++)
				{
					System.out.println(array[i]);
				}
		}

}
