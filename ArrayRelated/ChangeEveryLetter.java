package com.example.genric23_2020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChangeEveryLetter {
		
			public static void main(String[] args) {
				
					String str = "4 5 29 54 4 0 -214 542 -64 1 -3 6 -6";
					String s1 = "";
					String a[] = str.split(" ");
					Integer[] b=new Integer[a.length];
				
					for(int j=0;j<a.length;j++)
					{
						b[j] = Integer.parseInt(a[j]);
						System.out.println(b[j]);
					}
					List<Integer> list = new ArrayList<Integer>();
					for(int i=0;i<b.length;i++)
					{
						list.add(b[i]);
					}
					System.out.println(list);
					Collections.sort(list);
					System.out.println(list);

					if(list.size()==1)
					{
						s1 = list.get(0) +" " +list.get(0);
					}
					else {
						s1 = list.get(0) +" " +list.get(list.size()-1);
					}
			}
}
