package epam;
import java.util.*;

public class asum {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int Ar[]=new int[5];
		System.out.print("Enter the values: /n");
		for(int i=0;i<Ar.length;i++)
		{
			Ar[i]=sc.nextInt();
		}
		Arrays.sort(Ar);
		System.out.println("Maximum number is : "+Ar[4]);
		System.out.println("Minimum number is : "+Ar[0]);
		
	}

}
