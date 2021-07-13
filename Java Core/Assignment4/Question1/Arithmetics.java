package Ques1;
public class Arithmetics{
	public static void main(String[] args) {
		int x=30;
		int y=10;
		Operations op=(a,b)->x+y;
		int z=op.perform(x, y);
		System.out.println("The Arithmetic operation of " + x +" and " + y + " are: ");
		System.out.println("Addition -> " + z);
		
		Operations op1=(a,b)->x-y;
		int z1=op1.perform(x, y);
		System.out.println("Substraction -> " + z1);

		Operations op2=(a,b)->x*y;
		int z2=op2.perform(x, y);
		System.out.println("Multiplication ->" + z2);

		Operations op3=(a,b)->x/y;
		int z3=op3.perform(x, y);
		System.out.println("Division ->" + z3);
	}
}