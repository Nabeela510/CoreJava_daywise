package com.destination.sep_batch.oct_1;

import java.util.Scanner;

class ArrayOperation1{
	int arr[];
	int size;
	void createarray(int n) {
		size=n;
		arr=new int[size];
		System.out.println("Array is created successfully");
		System.out.println("------------------");
	}
	void adddata() {
		System.out.println("Collecting Array data: ");
		for(int i=0;i<size;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the marks of stuudent no. "+(i+1));
			arr[i]=sc.nextInt();
		}
		System.out.println("Marks entered successsfully");
		System.out.println("-----------------");
	}
	void display() {
		System.out.println("Display array data: ");
		for(int i=0;i<size;i++) {
			System.out.println("The marks of student no. "+(i+1)+ " is: "+arr[i]);
		}
	}
}
public class ArrayProgram1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the count of students: ");
	int n=sc.nextInt();
	ArrayOperation1 ao=new ArrayOperation1();
	ao.createarray(n);
	ao.adddata();
	ao.display();
}
}
