package com.example.genric23_2020;

public class PrimeChecker {
	
		public static void main(String[] args) {
			
			int num = 103;
			int count=0;
			boolean prime=false; 
			for(int j=1;j<=num;j++)
			{
					if(num%j==0){
						count++;
					}
			}
			if(count == 2)
			{
				prime = true;
			}
			else{
				prime = false;
			}
			System.out.println("prime is :" +prime +" " +num +" " +count);
		}
}
