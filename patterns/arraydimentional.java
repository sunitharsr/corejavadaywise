package patterns;

import java.util.Scanner;
class ArrayOperation{
	int arr[];
	int cls;
	int stu:
	void CreateArray(int n) {
		size=n;
		arr = new int[size];
		System.out.println("Array is created successfully");
	}
	void AddData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Collecting array Data: ");
		for(int i=0;i<size;i++) {
			System.out.println("Enter the marks of student no: "+(i+1));
			arr[i]=sc.nextInt();
			
		}
				;
	}
	void display() {
		System.out.println("Display array Data: ");
		for(int i=0;i<size;i++) {
			System.out.println("The Marks of Student np: "+(i+1)+" is = "+arr[i]);
			
		}
	}
	
}


public class arraydimentional {
	

	public static void main(String[] args) {
		

	}

}
