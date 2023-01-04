package epam;
import java.util.*;
public class pali {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string : ");
		String str=sc.next();
		StringBuffer str1=new StringBuffer(str);
		str1.reverse();
		if(str.contentEquals(str1))
		{
			System.out.println("its a palindrome!!!!!");
			
		}
		else
		{
			System.out.println("Noooo its not a palindromeee");
		}

	}

}
