package patterns.copy;
import java.util.Scanner;
public class pattern10 
{ 
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) 
			{
				if(j%2==0) {
					System.out.print("0 ");
				}
				else
				{
					System.out.print("1 ");
				}
				
				
			}
			System.out.println();
		}
	}
}


	
