package com.destination.sep_batch_programming.sep25;
import java.util.Scanner;
/*
 * 15
 * 14	13
 * 12	11	10
 * 9	8	7	6
 * 5	4	3	2	1
 */
public class Pattern13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		int k= n*(n+1)/2;
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=i;j++)
			{
			System.out.print(k);
			System.out.print(" 	");
			k--;
			}
			System.out.println();
		}
	}
}
