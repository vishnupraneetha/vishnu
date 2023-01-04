package mypack2;

import mypack.same_class;

public class non_sub {
	non_sub()
	{
		same_class sa=new same_class();
		//System.out.println("Default access specifier : "+sa.d);
		//System.out.println("private access specifier : "+sa.p);
		//System.out.println("protected access specifier : "+sa.pro);
		System.out.println("public access specifier : "+sa.pub);
	}

}
