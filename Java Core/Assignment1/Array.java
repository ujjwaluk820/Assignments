package Capg;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		
			int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
			
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter value to search");
			
			int value = sc.nextInt();
			
			for(int i=0;i<=15;i++) {
				if(arr[i]==value) {
					System.out.println("Value found at position "+i);
					System.exit(0);
				}
			
			}
			sc.close();
			
	}

}
