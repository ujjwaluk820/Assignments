package Ques1;
public class Arithmetics{
	public static void main(String[] args) {
		int x=30;
		int y=10;
		Operations op=(a,b)->x+y;
		int r=op.perform(x, y);
		System.out.println("The Arithmetic operation of " + x +" and " + y + " are: ");
		System.out.println("Addition -> " + r);
		
		Operations op1=(a,b)->x-y;
		int r1=op1.perform(x, y);
		System.out.println("Substraction -> " + r1);

		Operations op2=(a,b)->x*y;
		int r2=op2.perform(x, y);
		System.out.println("Multiplication ->" + r2);

		Operations op3=(a,b)->x/y;
		int r3=op3.perform(x, y);
		System.out.println("Division ->" + r3);
	}
}