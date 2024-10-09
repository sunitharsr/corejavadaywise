package patterns.copy;
import java.util.Scanner;
class ArrayOPeration
{
	int arr[][];
	int cls;
	int stu;
	void CreateArray(int n,int m) {
		cls =n;
		stu =m;
		arr = new int[n][m];
		System.out.println("Array is created Successfully");
		System.out.println("====================");
	}
	void addData() {
		Scanner sc =new Scanner(System.in);
		System.out.println("collacting array data: ");
		for(int i=0;i<cls;i++) 
		{
			System.out.println("inside class no: "+(i+1));
			for(int j=0;j<stu;j++) 
			{
				System.out.println("enter the marks of student no: "+(i+1));
				arr[i][j] = sc.nextInt();
			}
				
				
			
		}
		System.out.println("marks successfuly collected");
		System.out.println("====================");
	}

	void display() {
		Scanner sc =new Scanner(System.in);
		System.out.println("display array data: ");
		for(int i=0;i<cls;i++) 
		{
			System.out.println("inside class no: "+(i+1));
			for(int j=0;j<stu;j++) 
			{
				System.out.println("enter the marks of student no: "+(j+1)+" is= "+arr[i][j]);
			}
		}
	}
	
	
	
}
	

public class array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the class count: ");
		int cls= sc.nextInt();
		System.out.println("Enter the student count: ");
		
		ArrayOperation a0 = new ArrayOperation();
		int stu = sc.nextInt();
		a0.CreateArray(cls,stu);
		a0.addData();
		a0.display();
		
	}

}
