package Capg;
	import java.util.Collection;
	import java.util.Scanner;

	public class Parked_CarOwner_details {

		int token;
		private String owerName;
		private String carModel;
		private double owerMobileNo;
		private String owerAddress;
		static int i = 1;

		Scanner ip = new Scanner(System.in);
		  public Parked_CarOwner_details() {
			  
			  	
				System.out.println("Please enter your Name");
				owerName = ip.nextLine();
				System.out.println("Please enter your Car model");
				carModel = ip.nextLine();
				System.out.println("Please enter your Address");
				owerAddress = ip.nextLine();
				System.out.println("Please enter your Mob No");
				owerMobileNo = ip.nextInt();
				token = i;
				i++;
		  }
		  
		  
		  public int getToken() { return token; }
		  
		  
		  public void setToken(int token) { this.token = token; }
		  
		  
		  public String getOwerName() { return owerName; }
		  
		  
		  public void setOwerName(String owerName) { this.owerName = owerName; }
		  
		  
		  public String getCarModel() { return carModel; }
		  
		  
		  public void setCarModel(String carModel) { this.carModel = carModel; }
		  
		  
		  public double getOwerMobileNo() { return owerMobileNo; }
		  
		  
		  public void setOwerMobileNo(double owerMobileNo) { this.owerMobileNo =
		  owerMobileNo; }
		  
		  
		  public String getOwerAddress() { return owerAddress; }
		  
		  
		  public void setOwerAddress() { this.owerAddress = owerAddress; }
		  
		 
		@Override
		public String toString() {
			return "Parked_CarOwner_details [token=" + token + ", owerName=" + owerName + ", carModel=" + carModel
					+ ", owerMobileNo=" + owerMobileNo + ", owerAddress=" + owerAddress + "]";
		}

	}

