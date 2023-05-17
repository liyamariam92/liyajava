package P1;

public class Calculate extends Salary {
 double hra=basicPay;
 double pf;

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calculate c=new Calculate();
Calculate()
{
	
hra=basicPay*0.05;
pf=basicPay*0.2; 

		

		System.out.println("hra=" +hra);
		System.out.println("pf="+pf);
	}
}