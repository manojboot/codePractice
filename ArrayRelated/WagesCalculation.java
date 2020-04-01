package com.example.genric23_2020;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class WagesCalculation {
		
    			private static DecimalFormat df = new DecimalFormat("0.00");

			public static void main(String[] args) {
				
			
			double arr[] = {10.5, 17, 32.25, 1.5};
			double sum = 0;
			String earnedDay = "$";
			double wage = 0.00;
			
			wage = wage + (arr[1]-arr[0])*arr[2];
		
			df.setRoundingMode(RoundingMode.UP);
			earnedDay = earnedDay + df.format(wage);
			
			System.out.println(earnedDay);
			
			
			}

}
