package Ques1;
	interface operation {
		
	  public double opr(double i,double j);
			
	}

	public class Arithmetic {

		public static void main(String[] args) {
			
			
	operation addFn = (i,j) -> i+j;
	operation subFn = (i,j) -> i-j;
	operation divFn = (i,j) -> i/j;
	operation mulFn = (i,j) -> i*j;

	System.out.println(addFn.opr(30, 10));
	System.out.println(subFn.opr(30, 10));
	System.out.println(divFn.opr(30, 10));
	System.out.println(mulFn.opr(30, 10));

			
		

	}
}
