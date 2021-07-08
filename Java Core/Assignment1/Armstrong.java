package Capg;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {

				int num,r=0,sum=0,n=0;
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number");
				num = sc.nextInt();
				n=num;
				while (n!=0) {
			        r = n % 10;
			        sum = sum + r * r * r;
			        n = n / 10;
			    }
				if(sum==num)
				    System.out.println("It is an Armstrong number");
				else
				    System.out.println("Not an Armstrong number");


			}

		}


