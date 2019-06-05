package functional_interfaces_and_lambda_expressions;

interface interface3{
	
	public int sqaure(int i);
}

public class Example3 {

	public static void main(String[] args) {
		
		interface3 i = x -> x*x;
		System.out.println("Square of " + 5 + " is: " + i.sqaure(5));
	}
}
