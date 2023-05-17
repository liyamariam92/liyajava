package P1;

public class Car extends Vehicle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car obj=new Car();
obj.run();
Vehicle  obj1=new Car();//upcasting
obj1.run();
new Car().run();
	}
public void run()
{
	System.out.println("car is running");
}
}
