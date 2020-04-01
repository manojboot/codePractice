package com.example.genric23_2020;

public class MinMaxNumArray {
	
		public static void main(String[] args) {
			
			double arr[] = {1.346, 1.6532, 1.8734, 1.8723};
			double minNum = arr[0],maxNum=arr[0];
			double minMax[] = new double[2];
			for(int i=0;i<arr.length;i++)
			{
					if(arr[i]<=minNum)
					{
						minNum = arr[i];
						minMax[0] = minNum;
					}
				
			}
			for(int i=0;i<arr.length;i++)
			{
					if(arr[i]>=maxNum)
					{
						maxNum = arr[i];
						minMax[1] = maxNum;
					}
				
			}
			System.out.println(minNum);
			for(int i=0;i<minMax.length;i++)
			{
				System.out.println(minMax[i]);
			}
		}
		
}
