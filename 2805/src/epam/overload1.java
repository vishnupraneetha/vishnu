package epam;

public class overload1 {
	void area(double radius) {
		System.out.println("Area of circle is : "+3.14*3.14*radius );
	}

	int area(int side)
	{
		return side*side;
	}
	void area (int length,int breadth)
	{
		System.out.println("Area of rectangle is: "+length*breadth);
	}
	double area (double base,double heigth)
	{
		return 0.5*base*heigth;
	}

}
