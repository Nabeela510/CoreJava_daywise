package com.destination.sep_batch.sep_27;
import java.util.Scanner;
public class alpahabet_L {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==n-1 && j<=3*n/4)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==n-1 && j<=n/2)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
	}
}
