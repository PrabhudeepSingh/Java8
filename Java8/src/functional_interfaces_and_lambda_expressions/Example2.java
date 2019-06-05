package functional_interfaces_and_lambda_expressions;

interface interface2{
	public void mth(int a, int b);
}

public class Example2 {

	public static void main(String[] args) {
		
		interface2 i = (a, b) -> System.out.println("Sum: " + (a + b));
		i.mth(10, 20);
	}
}
