package epam;

public interface fruit {
	public void eat(String name, String taste);

}
class Apple implements fruit{

	@Override
	public void eat(String name, String taste) {
		// TODO Auto-generated method stub
		System.out.println("fruit name is "+name+" and its taste is "+taste);
	}
	
}
class Orange implements fruit{

	@Override
	public void eat(String name, String taste) {
		// TODO Auto-generated method stub
		System.out.println("fruit name is "+name+" and its taste is "+taste);
	}
	
}
