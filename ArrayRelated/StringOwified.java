package com.example.genric23_2020;

public class StringOwified {
		
			public static void main(String[] args) {
				
				String str = "Do you ever feel like a plastic bag";
				str = str.replace("i","wi").replace("e", "we").concat("owo");
				str = str.replace("a","er").replace("e","rt").replace("i","ty").replace("o","Tty").replace("u","uio");
				System.out.println(str);
				String str1 = "Donald Trump";
				String str2[] = str1.split(" ");
				String s1 = str2[1] +" " +str2[0];
				System.out.println(s1);
				String ss = "The quick brown fox!";
				ss=ss.replaceAll("[^a-zA-Z0-9\\s-_ ]", "");
				System.out.println(ss);
			}	
}
