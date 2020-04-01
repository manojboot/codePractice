package com.example.genric23_2020;

public class LunarSum {
		
		public static void main(String[] args) {
				
			int number1 = 246;
			int number2 = 317;
			int x1 = number1%10;
			int y1 = (number1/10)%10;
			int z1 = ((number1/10)/10)%10;
			System.out.println(x1 +" " +y1 +" " +z1);
			
			int x2 = number2%10;
			int y2 = (number2/10)%10;
			int z2 = ((number2/10)/10)%10;
			System.out.println(x2 +" " +y2 +" " +z2);
			
			String sum1  = "",sum2="",sum3="";
			
			if(x1>x2) {
				
				sum1 = String.valueOf(x1);
			}
			else {
				sum1 = String.valueOf(x2);
			}
			
			if(y1>y2) {
				
				sum2 = String.valueOf(y1);
			}
			else {
				sum2 = String.valueOf(y2);
			}
			
			if(z1>z2) {
				
				sum3 = String.valueOf(z1);
			}
			else {
				sum3 = String.valueOf(z2);
			}
			String s1 = sum3+sum2+sum1;
			int s32 = Integer.valueOf(s1);
			System.out.println(s32);
		}
}
