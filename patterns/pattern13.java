package patterns;
import java.util.Scanner;

public class pattern13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int count=1;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) 
			{
				if(count<10) {
					System.out.print("0" +count+" ");
				}
				else
				{
					System.out.print(count+" ");
				}
				count++;
				
				
			}
			System.out.println();
		}

	}

}
