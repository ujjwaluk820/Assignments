package Capg;

public class Total_cash {

	public static void main(String[] args) {
	
					Savings s=new Savings(30000,44000);
					Current c=new Current(45000,85000);
					System.out.println("Savings cash in bank " + s.getbalance());
					System.out.println("Current account balance " + c.getbalance());
					

				}

			}
