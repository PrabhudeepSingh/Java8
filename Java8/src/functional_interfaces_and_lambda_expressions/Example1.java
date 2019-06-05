package functional_interfaces_and_lambda_expressions;

interface interface1{
	public void mth();
}

public class Example1 {

	public static void main(String[] args) {
		
		interface1 i = () -> System.out.println("Prabhudeep Singh");
		i.mth();
	}
}
