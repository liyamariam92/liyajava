
public class Manager extends Employee{
	int hra=5000;
public static void main (String args[])
{
	
	Manager m=new Manager();
	System.out.println(m.basicSalary+m.hra);
	m.display();
}
}
