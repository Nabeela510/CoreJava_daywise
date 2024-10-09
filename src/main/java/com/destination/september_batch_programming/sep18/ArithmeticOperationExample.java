package com.destination.september_batch_programming.sep18;
class ArithmeticOperation{
	void add(int a, int b) {
		int res1= a+b;
		System.out.println("addition operation result: "+res1);
		System.out.println("---------------------------------");
	}
	void sub(int a, int b) {
		int res2= a-b;
		System.out.println("subtraction operation result: "+res2);
		System.out.println("---------------------------------");
	}
	void mul(int a, int b) {
		int res3= a*b;
		System.out.println("multiplication operation result: "+res3);
		System.out.println("---------------------------------");
	}
	void div(int a, int b) {
		int res4= a/b;
		System.out.println("division operation result: "+res4);
		System.out.println("---------------------------------");
	}
	void mod(int a, int b) {
		int res5= a%b;
		System.out.println("modulus operation result: "+res5);
		System.out.println("---------------------------------");
	}
}

public class ArithmeticOperationExample {
	public static void main(String[] args) {
		System.out.println("----------- Addition Operation --------------");
		ArithmeticOperation ao= new ArithmeticOperation();
		int a =100;
		int b =50;
		ao.add(a, b);
		ao.sub(a, b);
		ao.mul(a, b);
		ao.div(a, b);
		ao.mod(a, b);
		
	}

}
