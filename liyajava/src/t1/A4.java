package t1;

public class A4 {
	  
		A4 getA4(){  
		return this;  
		}  
		void msg(){
			System.out.println("Hello java");}  
}
	 class Test
	 {
		public static void main(String[] args)
		{  

	    new A4().getA4().msg();  
		}
	    }  

