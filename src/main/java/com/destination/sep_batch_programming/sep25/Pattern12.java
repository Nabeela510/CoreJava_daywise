package com.destination.sep_batch_programming.sep25;
import java.util.Scanner;
/*
 * 1
 * 2	3
 * 4	5	6
 * 7	8	9	10
 * 11	12	13	14	15
 */
public class Pattern12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		int k=1;
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=i;j++)
			{
			System.out.print(k);
			System.out.print(" 	");
			k++;
			}
			System.out.println();
		}
		
	}
}
