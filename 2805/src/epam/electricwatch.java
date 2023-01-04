package epam;
import java.util.*;
public class electricwatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of seconds : ");
		long sec=sc.nextLong();
		long min=(sec/60)%60;
		sec=sec%60;
		long hr=(sec/3600)%24;
		sec=sec%3600;
	    System.out.printf("%d:%0,2d:%0,2d",hr,min,sec);

	}

}
