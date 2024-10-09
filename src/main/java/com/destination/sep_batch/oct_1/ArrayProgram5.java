package com.destination.sep_batch.oct_1;
import java.util.Scanner;

class ArrayOperation5{
	String arr[][][];
	int col;
	Scanner sc=new Scanner(System.in);
	
	void createarray(int n) {
		col=n;
		
		arr=new String[n][][];
		System.out.println("collecting class count for each college: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the class count inside the college no.  "+(i+1));
			int cls=sc.nextInt();
			arr[i]=new String[cls][];
		}
		for (int i=0;i<arr.length;i++) {
			System.out.println("inside college no. "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter the student count inside the class no.  "+(j+1));
				int stu=sc.nextInt();
				arr[i][j]=new String[stu];
			}
		}
		System.out.println("Array is created successfully");
		System.out.println("------------------");
	}
	void adddata() { 
		
		System.out.println("Collecting Array data: ");
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println("inside the college no. "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside the class no. "+(j+1));
				for (int k=0;k<arr[i][j].length;k++) {
					System.out.println("enter the name of student no. "+(k+1));
					arr[i][j][k]=sc.next();
				}
				
			}
			
		}
		System.out.println("Marks entered successsfully");
		System.out.println("-----------------");
	}
	void display() {
		System.out.println("Display array data: ");
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println("inside the college no. "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside the class no. "+(j+1));
				for (int k=0;k<arr[i][j].length;k++) {
					System.out.println("the name of student no. "+(k+1)+"is: "+arr[i][j][k]);
					
				}
				
			}
		}
	}
}
public class ArrayProgram5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the college count: ");
		int n=sc.nextInt();
		ArrayOperation5 ao=new ArrayOperation5();
		ao.createarray(n);
		ao.adddata();
		ao.display();
	}
}
