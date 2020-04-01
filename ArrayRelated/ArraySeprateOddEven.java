package com.example.genric23_2020;

public class ArraySeprateOddEven {
	
			public static void main(String[] args) {
				
					int a[] = {12, 34, 45, 9, 8, 90, 3};
					int b[] = new int[a.length];int c[] = new int[3];
					for(int i=0;i<a.length-1;i++)
					{
						if(a[i]%2==0)
						{
							b[i]=a[i];
						}
						
					}
					for(int i=0;i<b.length-1;i++)
					{
						System.out.println(b[i]);
					}
			}

}
