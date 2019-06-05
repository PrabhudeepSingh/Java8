package functional_interfaces_and_lambda_expressions;

interface interface5{
	
	public void mth();
}

public class LocalVariables {

	int x = 1;
	
	public void mth2() {
		
		int y = 2;
		
		interface5 i = () -> {
			
			System.out.println("x: " + x);
			System.out.println("y: " + y);
			
			x = 10;
			//y = 20;
			/*
			 * Local variable y defined in an enclosing scope 
			 * must be final or effectively final.
			 */
		};
		
		i.mth();
	}
}
