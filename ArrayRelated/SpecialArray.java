package com.example.genric23_2020;

public class SpecialArray {
	
			public static void main(String[] args) {
				 
					int a[] = {1,1,1,2};
					
					for(int i=0;i<a.length;i++)
					{
						System.out.print(a[i]+" ");
					}
					int i,j;boolean b = true;
					int count = 0,cnt =0;
					System.out.println();
					for(i=0,j=1;i<a.length && j<a.length;i=i+2,j=j+2)
					{
						if((a[i]%2==0 && i%2==0) && !(a[j]%2==0))
						{
						   System.out.println(i +" : " +a[i]);
						   count++;
						}
						else {
							System.out.println(i +" - " +a[i]);
							cnt++;
						}
					}
					System.out.println(count +" " +cnt);
					System.out.println("Array details");
					if(cnt==0)
					{
						System.out.println("special array");
					}
					else {
						System.out.println("not special array");

					}
			}

}
