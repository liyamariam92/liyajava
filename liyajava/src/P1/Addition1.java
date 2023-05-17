package P1;

public class Addition1 extends Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Addition1 obj=new Addition1();
obj.divisible();
	}
public void divisible()
{
	super.sum();
	if(sum%10==0)
	{
		System.out.println("number is divisible by 10");
		
	}
	else
	{
		System.out.println("number is not divisible by 10");	
	}
}
}
