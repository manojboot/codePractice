package com.example.genric23_2020;

public class CapitalizeName {
		
			public static void main(String[] args) {
				
				String str[] = {"manoj","jaquline","kapil","BIGG"};
				for(int i=0;i<str.length;i++)
				{
					str[i] = str[i].toLowerCase();
				}
				for(int i=0;i<str.length;i++)
				{
					str[i]=str[i].substring(0).toUpperCase().charAt(0)+str[i].substring(1,str[i].length());
					
				}
			
			for(int i=0;i<str.length;i++)
			{
				System.out.println(str[i]);
			}
				
 			}
}
