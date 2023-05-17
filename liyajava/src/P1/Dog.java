package P1;

public class Dog extends Animal{
String colour="red";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog d=new Dog();
d.colour();

	}
Dog()
{
	super(5);
	System.out.println("constructor is invoked");
}

	public void colour()
	{
		System.out.println("print colour="+colour);
		System.out.println("parent class colour="+super.colour);
	super.col();
	
	}
}
