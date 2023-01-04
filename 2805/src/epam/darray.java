package epam;
import java.util.*;
public class darray {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int[][] array=new int[3][3];
	System.out.println("Enter the values: ");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			array[i][j]=sc.nextInt();
		}
	}
	System.out.println("Entered values are: ");
	for(int i[]:array)
	{
		for(int j:i)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
	System.out.println("Reversed matrix :");
	for(int i=array.length-1;i>=0;i--)
	{
		for(int j=array.length-1;j>=0;j--)
		{
			System.out.print(array[i][j]+" ");
		}
		System.out.println();
	}
}
}
