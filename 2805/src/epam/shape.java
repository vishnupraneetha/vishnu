package epam;

public class shape {
	public void area() {
		System.out.println("Area metod of shape class");
	}
	
}
 class rectangle extends shape
{
	public void area(int side,int side1) {
		System.out.println("Area of rectangle is : "+side*side1);
	}
	
}
 class square extends shape{
	public void area(int side)
	{
		System.out.println("Area of square is : "+side*side);
	}
}
