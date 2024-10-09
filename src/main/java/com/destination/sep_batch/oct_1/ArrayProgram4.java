package com.destination.sep_batch.oct_1;
import java.util.Scanner;

class ArrayOperation4{
	String arr[][][];
	int cls;
	int stu;
	int clg;
	void createarray(int a,int b,int c) {
		clg=a;
		cls=b;
		stu=c;
		arr=new String[a][b][c];
		System.out.println("Array is created successfully");
		System.out.println("------------------");
	}
	void adddata() { 
		Scanner sc=new Scanner(System.in);
		System.out.println("Collecting Array data: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("inside the college no: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside class no. "+(j+1));
			
				for (int k=0;k<arr[i][j].length;k++) {
					System.out.println("enter the name of student  no. "+(k+1));
					arr[i][j][k]=sc.next();
				}
			}
			
		}
		System.out.println("data entered successsfully");
		System.out.println("-----------------");
	}
	void display() {
		System.out.println("Display array data: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside college no. "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("the class no: "+(j+1));
				for (int k=0;k<arr[i][j].length;k++) {
					System.out.println("the name of student no. "+(k+1)+"is: "+arr[i][j][k]);
				}
			}
		}
	}
}
public class ArrayProgram4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("the college count is: ");
		int clg=sc.nextInt();
		System.out.println("enter the class count: ");
		int cls=sc.nextInt();
		System.out.println("enter the student count: ");
		int stu=sc.nextInt();
		ArrayOperation4 ao=new ArrayOperation4();
		ao.createarray(clg,cls,stu);
		ao.adddata();
		ao.display();
	}
}
