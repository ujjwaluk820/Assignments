package Capg;
import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		 
				int counter=0;
				String username,password;
				while(counter<=3)
				{
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter user id");
					username= sc.nextLine();
					System.out.println("Enter password");
					password= sc.nextLine();
					if(username.equals("Ujjwal")&&password.equals("kumar1"))
					{
						System.out.println("Welcome");
						System.exit(0);
					}
					else
						counter++;
					}
				if(counter>3)
				{
					System.out.println("Contact Admin");
				}

	   }

     }
