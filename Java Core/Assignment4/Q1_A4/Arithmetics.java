package Capg;

public class Arithmetics {
	  
		public static void main(String[] args) {
			LambdaFunction lambdaFunction1=(int a,int b) -> a+b;
			LambdaFunction lambdaFunction2=(int a,int b) -> a-b;
			LambdaFunction lambdaFunction3=(int a,int b) -> a*b;
			LambdaFunction lambdaFunction4=(int a,int b) -> a/b;

			System.out.println(lambdaFunction1.lambda(32,301));
			System.out.println(lambdaFunction2.lambda(58,19));
			System.out.println(lambdaFunction3.lambda(15,5));
			System.out.println(lambdaFunction4.lambda(16,4));

		}

	}
	interface LambdaFunction{
		int lambda(int x,int y);

		} 
 

