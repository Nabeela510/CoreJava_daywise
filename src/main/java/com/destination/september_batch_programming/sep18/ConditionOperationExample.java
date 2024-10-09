package com.destination.september_batch_programming.sep18;

public class ConditionOperationExample {
	public static void main(String[] args) {
		System.out.println("------------ Conditional Operation------------");
		int a=100;
		int b=50;
		System.out.println("valu 1: "+a);
		System.out.println("valu 2: "+b);
		System.out.println("--------------------------");
		boolean res1=a>b;
		System.out.println("Greater to result: "+res1);
		System.out.println("--------------------------------");
		boolean res2=a<b;
		System.out.println("Lesser to result: "+res2);
		System.out.println("--------------------------------");
		boolean res3=(a>=b);
		System.out.println("Greater than or equal to result: "+res3);
		System.out.println("--------------------------------");
		boolean res4=(a<=b);
		System.out.println("Lesser than or equal to result: "+res4);
		System.out.println("--------------------------------");
		boolean res5=(a==b);
		System.out.println("Equal to result: "+res5);
		System.out.println("--------------------------------");
		boolean res6=(a!=b);
		System.out.println("Not Equal to result: "+res6);
		System.out.println("--------------------------------");
		}

}
