package patterns.copy;

import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		char c='A';
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) 
			{
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}

	}

}
