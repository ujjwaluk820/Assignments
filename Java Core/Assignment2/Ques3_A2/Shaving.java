package Capg;

class Savings extends Bank_account {
	double fixed;
	Savings(double balance,double f){
		this.balance=balance;
		this.fixed=f;
		
	}

	double getbalance()
	{
		return(balance + fixed);
	}
}


