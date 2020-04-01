package com.example.genric23_2020;

import java.util.Arrays;

public class ArrayDifference {
		
			public static void main(String[] args) {
				
				int a = 100;
				int b =50;
				int c = 21;
				int ar[] = {a,b,c};
				Arrays.sort(ar);
				System.out.println(ar[2]-ar[0]);
				String str ="bm s, wtht qstn, th WRST VR prsdnt.  prdct h wll nw d smthng rlly bd nd ttlly stpd t shw mnhd!";
				char ch = '*';
				String s = Character.toString(ch);
				str = str.replaceAll("[a,e,i,o,u]", "");
				System.out.println(str);
				String s2 = "spacce";
				String s3 = "";
				char[] s1 = s2.toCharArray();
				for(int i=0;i<s1.length;i++)
				{
						s3= s3 + s2.charAt(i) + " ";
				}
				System.out.println(s3.trim());
				int x = 47045881;
				int count=0;
				while(x>1)
				{
					x = x/19;
					count++;
				}
				System.out.println(count);
			}
}
