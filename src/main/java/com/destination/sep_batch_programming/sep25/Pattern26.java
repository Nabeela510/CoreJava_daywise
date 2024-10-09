package com.destination.sep_batch_programming.sep25;
/*
-	-	-	-	-	1	
-	-	-	-	1	2	3	
-	-	-	1	2	3	4	5	
-	-	1	2	3	4	5	6	7	
-	1	2	3	4	5	6	7	8	9	
-	1	2	3	4	5	6	7	8	9	
-	-	1	2	3	4	5	6	7	
-	-	-	1	2	3	4	5	
-	-	-	-	1	2	3	
-	-	-	-	-	1	
 */
import java.util.Scanner;

public class Pattern26 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
	
		for(int i=0;i<n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print("-	");
			}
			int count=1;
			
			for (int j=0;j<=2*i;j++)
			{
				System.out.print(count+"	");
				count++;
			
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("-	");
			}
			int count=1;
			
			for (int j=(2*n)-1;j>2*i;j--)
			{
				System.out.print(count+"	");
				count++;
			
			}
			System.out.println();
		}
	}
}
