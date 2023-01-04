package epam;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Prime number between 10 and 99");
		for(num=2;num<100;num++)
		{
			int m,flag=0;
			m=num/2;
			if(num==0||num==1)
			{
				break;
			}
			for(int i=2;i<=m;i++)
			{
				if(num%i==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.print(num+" ");
			}
				
		}

	}

}
