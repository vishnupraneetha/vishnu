package epam;
import java.util.*;
public class string {
public static void main(String args[])
{
	String s1="CST ";
	String s2="madam";
	String s3=new String("GPREC").intern();
	String s4=new String("CST").intern();
	System.out.println(s1+" "+s2+" "+s3+" "+s4 );
	System.out.println(s1.equals(s2));
	System.out.println(s2.equals(s3));
	System.out.println(s3.equals(s4));
	System.out.println(s1==s2);
	System.out.println(s2==s3);
	System.out.println(s3==s4);
	//s3.intern();
	//s4.intern();
	System.out.println(s1==s2);
	System.out.println(s2==s3);
	System.out.println(s3==s4);
	System.out.println(s1.equals(s2));
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s1.charAt(2));
	System.out.println(s1.concat(s3));
	System.out.println(s3.substring(0,3));
	System.out.println(s1+s2);
	StringBuffer s5 =new StringBuffer("madam");
	s5.reverse();
	System.out.println(s2.contentEquals(s5));
}
}
                         