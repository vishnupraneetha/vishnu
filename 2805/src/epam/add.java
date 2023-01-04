package epam;
import java.util.*;
public class add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int a[]=new int [6];
      System.out.println("Enter th values : ");
      for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
      Arrays.sort(a);
      int b=0;
      for(int i=0;i<a.length-1;i++)
      {
    	  if(a[i]==a[i+1])
    	  {
    		  b=a[i];
    	  }
    	  if(b!=0)
    	  System.out.println(b+" ");
      }
	}

}
