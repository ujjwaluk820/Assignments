package Capg;
	import java.util.Scanner;
	public class Desertshop {

		public static void main(String[] args) {

			Candys candy1= new Candys(5,20,20);
			Cookies cookie1= new Cookies(3,20,5);
			IceCream iceCream1= new IceCream(70,10,5);
			int i=0;
			do{
				int itemNo=0,qty=0;
				System.out.println("\n\nPlease select your role \n1. Owner \n2. Customer\n0. Exit\n");
				Scanner sin= new Scanner(System.in);
				i = sin.nextInt();	
				if(i==1){
					candy1.getDetails();
					cookie1.getDetails();
					iceCream1.getDetails();
					System.out.println("\nPlease select item to add");
					itemNo = sin.nextInt();
					System.out.print("\nPlease enter quantity : ");
					qty = sin.nextInt();
					switch(itemNo) {
					  case 1:
					  	candy1.addItem(qty);
					    break;
					  case 2:
					  	cookie1.addItem(qty);
					    break;
					  case 3:
					  	iceCream1.addItem(qty);
					    break;
					  default:
					    System.out.println("\nInvalid choice.\n");
					}

				}
				else if(i==2){
					candy1.getDetails();
					cookie1.getDetails();
					iceCream1.getDetails();
					System.out.println("\nPlease select an item to order");
					itemNo = sin.nextInt();
					System.out.print("\nPlease enter quantity : ");
					qty = sin.nextInt();
					switch(itemNo) {
					  case 1:
					  	candy1.buyItem(qty);
					    break;
					  case 2:
					  	cookie1.buyItem(qty);
					    break;
					  case 3:
					  	iceCream1.buyItem(qty);
					    break;
					  default:
					    System.out.println("\nInvalid choice.\n");
					}
				}
				else if(i!=0){
					System.out.println("\nInvalid choice.\n");
				}
			}while(i!=0);
			
		}
	}

