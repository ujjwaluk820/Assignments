package Capg;

public class Orders {
		public static void main(String[] args) {
			 priceLambda my= str -> {
		            if(str>10000) {
		                return ("The order status is accepted");
		            }
		            else {
		                return ("The order status is not accepted");
		            }
		        };
		        System.out.println(my.price(7000));
		        System.out.println(my.price(12500));
		        System.out.println(my.price(8500));
		        System.out.println(my.price(15000));
		    }
		    interface priceLambda {
		        String price(int str);


		}

	}
