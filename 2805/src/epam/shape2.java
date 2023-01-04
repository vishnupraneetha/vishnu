package epam;

public interface shape2 {
	public  void area(double r);

}
class circle implements shape2{

	@Override
	public void area(double r) {
		// TODO Auto-generated method stub
		System.out.println("Area of circle is : "+3.14*r*r);
	}
	
	
}
class square1 implements shape2{

	@Override
	public void area(double r) {
		// TODO Auto-generated method stub
		System.out.println("Area of square is : "+r*r);
	}
	
	
}
