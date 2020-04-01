package com.example.genric23_2020;

public class RemoveVowels {
	
	public static void main(String[] args) {
		

		String s = "If Obama resigns from office NOW, thereby doing a great service to the country—I will give him free lifetime golf at any one of my courses!";
		String s1 = s.replaceAll("[aeiouAEIOU]","");
		System.out.println(s1);
		System.out.println(s1.length());
		
		String str = "qudusayo";
		int count = 0;
		char ch[] = str.toCharArray();
		char c[] = {'a','b','c','d','e','i','g','h','i','j','k','l','m','n','o','p','q','r','s','t','q','u','v','w','x','y','z'};
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				if(ch[i]==c[j])
				{
					System.out.println(j);
					count = count + j+1;
				}
			}
		}
		int x = 32;
	}
}
