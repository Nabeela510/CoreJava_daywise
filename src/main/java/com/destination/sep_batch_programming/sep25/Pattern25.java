package com.destination.sep_batch_programming.sep25;
/*
A 	B 	C 	D 	E 	
F 	G 	H 	I 	J 	
K 	L 	M 	N 	O 	
P 	Q 	R 	S 	T 	
U 	V 	W 	X 	Y 
 */
import java.util.Scanner;

public class Pattern25 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		char c = 'A';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(c+" 	");
				c++;
			}
			System.out.println();
		}
	}
}
