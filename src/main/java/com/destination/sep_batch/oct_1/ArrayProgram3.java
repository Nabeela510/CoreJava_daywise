package com.destination.sep_batch.oct_1;

import java.util.Scanner;

class ArrayOperation3{
	int arr[][];
	int cls;
	Scanner sc=new Scanner(System.in);
	
	void createarray(int n) {
		cls=n;
		
		arr=new int[n][];
		System.out.println("collecting student count for each class: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the student count inside the class no. : "+(i+1));
			int stu=sc.nextInt();
			arr[i]=new int[stu];
		}
		System.out.println("Array is created successfully");
		System.out.println("------------------");
	}
	void adddata() { 
		
		System.out.println("Collecting Array data: ");
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println("inside the class no, "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter the marks of student no. "+(j+1));
				arr[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("Marks entered successsfully");
		System.out.println("-----------------");
	}
	void display() {
		System.out.println("Display array data: ");
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println("inside the class no: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("the marks of student no: "+(j+1)+" is= "+arr[i][j]);
			}
		}
	}
}
public class ArrayProgram3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the class count: ");
		int cls=sc.nextInt();
		ArrayOperation3 ao=new ArrayOperation3();
		ao.createarray(cls);
		ao.adddata();
		ao.display();
	}
}
