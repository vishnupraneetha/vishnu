package gprec.math;

public class userpack {
	public void poli(String a){
		StringBuffer s=new StringBuffer(a);
		StringBuffer str=s.reverse();
		if(a.contentEquals(str))
		{
			System.out.println("Yes!! "+a+" is a polindrome");
		}
		else
		{
			System.out.println("No "+a+" is not a polindrome");
		}
		
	}
	public void sum(int num)
	{
		int b=0;
		int n=num;
		while(num!=0)
		{
			b=b+num%10;
			num=num/10;
		}
		System.out.println("Sum of "+n +" digits is "+b);
	}
	public int reverse(int no)
	{
		int rev=0;
		while(no>0)
		{
			rev=rev*10+no%10;
			no=no/10;
		}
		return rev;
	}
	public void power(int a,int b)
	{
		int res=1;
		for(int i=1;i<=b;i++)
		{
			res=res*a;
			
		}
		System.out.println(res);
	}

}
