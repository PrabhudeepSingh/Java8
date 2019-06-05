package functional_interfaces_and_lambda_expressions;

interface interface4{
	
	public void mth1();
}

public class ThisKeyword {

	/*
	 * Within lambda expression 'this' keyword represents current outer 
	 * class object reference.
	 */
	int x = 5;
	
	public void mth2() {
		
		int x = 10;
		interface4 i = () -> {
			System.out.println("x: " + x);	//10
			System.out.println("this.x: " + this.x);	//5
		};
		i.mth1();
	}
	
	public static void main(String[] args) {
		
		ThisKeyword obj = new ThisKeyword();
		obj.mth2();
	}
}
