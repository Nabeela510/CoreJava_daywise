package com.destination.sep_batch.oct_1;
import java.util.Scanner;

class ArrayOperation2{
	int arr[][];
	int cls;
	int stu;
	
	void createarray(int n,int m) {
		cls=n;
		stu=m;
		arr=new int[n][m];
		System.out.println("Array is created successfully");
		System.out.println("------------------");
	}
	void adddata() { 
		Scanner sc=new Scanner(System.in);
		System.out.println("Collecting Array data: ");
		for(int i=0;i<cls;i++)
		{
			
			System.out.println("inside the class no: "+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("enter the marks of student no. "+(j+1));
				arr[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("Marks entered successsfully");
		System.out.println("-----------------");
	}
	void display() {
		System.out.println("Display array data: ");
		for(int i=0;i<cls;i++) {
			System.out.println("Inside class no. "+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("the marks of student no: "+(j+1)+" is= "+arr[i][j]);
			}
		}
	}
}
public class ArrayProgram2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the class count: ");
		int cls=sc.nextInt();
		System.out.println("enter the student count: ");
		int stu=sc.nextInt();
		ArrayOperation2 ao=new ArrayOperation2();
		ao.createarray(cls,stu);
		ao.adddata();
		ao.display();
	}
}
