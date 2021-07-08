package Capg;

public class ArmstrongRange {

	public static void main(String[] args) {
		
				int r=0,sum=0,n=0,i;
				System.out.println("Armsrtong numbers between 100 to 999");
				for(i=100;i<=999;i++)
				{
					n=i;
					while (n!=0) {
				        r = n % 10;
				        sum = sum + r * r * r;
				        n = n / 10;
					}
					if(sum==i) {
						System.out.println(i);
					}
					sum=0;
				}
					
	}
}
