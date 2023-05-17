
package P1;
import java.util.Scanner;
public class Addition {
int s1,s2,sum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Addition a=new Addition();
System.out.println("sum=" +a.sum());
	}
public int sum()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first number");
	s1=sc.nextInt();
	System.out.println("enter second number");
	s2=sc.nextInt();
	sum=s1+s2;
	return sum;
}
}
