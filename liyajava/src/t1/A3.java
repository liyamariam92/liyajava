package t1;

public class A3 {
	 int data=10;  
	  A3(){  
	   B b=new B(this);  
	   b.display();  
	  }  
	  public static void main(String args[]){  
	   A3 a=new A3();  
	  }  
}
	class B{  
		  A3 obj;  
		  B(A3 obj){  
		    this.obj=obj;  
		  }  
		  void display(){  
		    System.out.println(obj.data);
		  }  
		}  
		  
		
		 

