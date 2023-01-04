package epam;
import java.util.*;
public class conc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any two strings : ");
      String s1=sc.nextLine();
      String s2=sc.nextLine();
      if(s1.charAt(s1.length()-1)==(s2.charAt(0))) {
    	  System.out.println(s1.concat(s2.substring(1)).toLowerCase());
      }
      else
      {
      System.out.println(s1.toLowerCase().concat(s2.toLowerCase()));
	}
	}

}
