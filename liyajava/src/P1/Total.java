package P1;

public class Total extends Calculate {
double totalSalary;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Total t=new Total();
t.totalSalary =t.basicPay+t.hra-t.pf-t.deduction+t. bonus;
System.out.println("total slary="+t.totalSalary);
System.out.println("basic pay="+t.basicPay );
System.out.println("deduction="+t.deduction );
System.out.println("bonus="+t.bonus );
System.out.println("hra="+t.hra );
System.out.println("pf="+t.pf);
	}

}
