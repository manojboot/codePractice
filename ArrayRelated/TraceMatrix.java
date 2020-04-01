package com.example.genric23_2020;

public class TraceMatrix {
	
		/*This is a Java Program to Find the Trace & Normal of a given Matrix. 
		  The Trace of a matrix is the sum of main diagonal whereas the Normal is the square root of the sum of 
		  squares of all elements of a matrix. */
		
			public static void main(String[] args) {
				
				int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
				int sum = 0;
				int normalSum = 0;
				for(int i=0;i<a.length;i++)
				{
					for(int j=0;j<a.length;j++)
					{
						System.out.print(a[i][j] +" ");
					}
					System.out.println();
				}
				System.out.println();
				for(int i=0;i<a.length;i++)
				{
					for(int j=0;j<a.length;j++)
					{
						normalSum = normalSum + a[i][j]*a[i][j];
						if(i==j)
						{
							sum = sum + a[i][j];
						}
					}
				}
				System.out.println("Trace of Matrix is :" +sum);
				System.out.println("Nirmal of Matrix is :" +Math.sqrt(normalSum));
			}	
}
