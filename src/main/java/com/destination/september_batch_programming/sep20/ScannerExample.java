package com.destination.september_batch_programming.sep20;
import java.util.Scanner;
public class ScannerExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the byte value: ");
		byte b=sc.nextByte();
		System.out.println("the byte value is: "+b);
		System.out.println("---------------------");
		System.out.println("enter the short value: ");
		short s=sc.nextShort();
		System.out.println("the short value is: "+s);
		System.out.println("---------------------");
		System.out.println("enter the integer value: ");
		int i=sc.nextInt();
		System.out.println("the int value is: "+i);
		System.out.println("---------------------");
		System.out.println("enter the long value: ");
		long l=sc.nextLong();
		System.out.println("the long value is: "+l);
		System.out.println("---------------------");
		System.out.println("enter the string value: ");
		String str=sc.next();
		System.out.println("the string value is: "+str);
		System.out.println("---------------------");
		System.out.println("enter the float value: ");
		float f=sc.nextFloat();
		System.out.println("the float value is: "+f);
		System.out.println("---------------------");
		System.out.println("enter the double value: ");
		double d=sc.nextDouble();
		System.out.println("the double value is: "+d);
		System.out.println("---------------------");
		System.out.println("enter the string statement: ");
		String ss=sc.nextLine();
		System.out.println("the string statement is: "+ss);           //does not giv the output
		System.out.println("---------------------");
	}
	
	

}
