package com.destination.septemberbatchprogramming.sep19;

public class LogicalOperator {
	public static void main(String[] args) {
		int a=10;
		int b=100;
		int c=1000;
		System.out.println("logical AND example");
		boolean res1=(a>5 && b<150 && c<2000);
		System.out.println(res1);
		boolean res2=(a>10 && b>150 && c<2000);
		System.out.println(res2);
		System.out.println("-------------------------");
		System.out.println("logical OR example");
		boolean res3=(a>5 || b<150 || c<2000);
		System.out.println(res3);
		boolean res4=(a>10 || b>150 || c<2000);
		System.out.println(res4);
		System.out.println("-------------------------");
	}

}
