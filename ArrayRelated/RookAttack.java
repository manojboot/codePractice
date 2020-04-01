package com.example.genric23_2020;

public class RookAttack {
		
		public static void main(String[] args) {
			
			String str[] = {"A8","E8"};
			if((str[0].charAt(0)==str[1].charAt(0)) || (str[0].charAt(1)==str[1].charAt(1)))
			{
				System.out.println("Rook Attajk");
			}
			String date = "11/22/2019";
			String[] str1 = date.split("/");
			StringBuffer sb = new StringBuffer();
			
			for(int i=str1.length-1;i>=0;i--)
			{
				sb.append(str1[i]);
			}
			System.out.println(sb.toString());
		}
}
