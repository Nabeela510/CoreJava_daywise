package com.destination.sep_batch_programming.sep25;
/*
1	0	1	0	1	
1	0	1	0	1	
1	0	1	0	1	
1	0	1	0	1	
1	0	1	0	1
 */
import java.util.Scanner;

public class Pattern23 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j%2!=0)
				{
					System.out.print("0	");
				}
				else
				{
					System.out.print("1	");
				}
			}
			System.out.println();
		}
	}


}
