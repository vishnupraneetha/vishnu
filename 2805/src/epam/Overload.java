package epam;

public class Overload {
    public static void main(String args[])
    {
    	overload1 ob=new overload1();
    	ob.area(3.1);
    	System.out.println("Arae of square is :"+ob.area(5));
    	ob.area(4,3);
    	System.out.println("Area of triangle is :"+ob.area(2.5,2.4));
    }
}
