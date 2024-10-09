package patterns;
import java.util.Scanner;

class ArrayOperation
{
	String arr[][][];
	int clg;
	int cls;
	int stu;
	Scanner sc = new Scanner(System.in);
	
	void CreateArray(int n,int m, int o) {
		arr =new String[m][n][o];
		System.out.println("array is created successfully");
		System.out.println("=====================");
		
			   
	}
	void addData() {
		System.out.println("collacting array data: ");
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println("inside colleg  no: "+(i+1));
			for(int j=0;j<arr[i].length;j++) 
			{
				System.out.println("inside class no: "+(j+1));
		        for(int k=0;k<arr[i][j].length;k++) {
		        	
				    System.out.println("enter the name  of student no: "+(k+1));
				    arr[i][j][k] = sc.next();
		        }
			}
		}
        System.out.println("marks successfuly collected");
        System.out.println("====================");
	}
	

	void display() {
		
		System.out.println("display array data: ");
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println("inside colleg no: "+(i+1));
			for(int j=0;j<arr[i].length;j++) 
			{
				System.out.println("inside class no: "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					
			        System.out.println("enter the marks of student no: "+(k+1)+" is= "+arr[i][j][k]);
				}
			}
		}
	}
}	



public class arrayoperationforthreedimentionalarray{
	public static void main(String[] args) {
		ArrayOperation ao = new ArrayOperation();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the college count: ");
		int m = sc.nextInt();
		System.out.println("enter the class count: ");
		int n = sc.nextInt();
		System.out.println("enter the student count: ");
		int o = sc.nextInt();
		ao.CreateArray(m,n,o);
		ao.addData();
		ao.display();
		
	}

}



