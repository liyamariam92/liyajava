package t1;

public class Factorial {
int num;
int fact=1;
int i=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Factorial f1=new Factorial();
f1.display();
		
	}


	public void Fact(int num)
	{
		this.num=num;
		
		while(i<=num)
		{
			fact=fact*i;
			i++;
		}
	}
	public void display(){
		
		this.Fact(5);
			System.out.println("factorial is:"+fact);
	}
	}	
	

