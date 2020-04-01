package com.example.genric23_2020;

public class PositiveNegativeSum {
	
		public static void main(String[] args) {
			
			int[]a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
			int positiveSum = 0,negativeSum=0;
			int b[] = new int[2];
			for(int i=0;i<a.length;i++)
				{
				if(a[i]>0)
				{
					positiveSum = positiveSum + a[i];
				}
				else{
					negativeSum = negativeSum + a[i];
				}
			}
			System.out.println(negativeSum  +" " +positiveSum);
			b[0]=negativeSum;b[1]=positiveSum;
			for(int i=0;i<b.length;i++)
			{
				System.out.println(b[i]);
			}
		}
}
