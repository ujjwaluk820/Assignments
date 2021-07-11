package Capg;

	class Current extends Bank_account {
		double cashcredit;
		Current(double balance,double cd){
			this.balance=balance;
			this.cashcredit=cd;
		}
	double getbalance(double d) {
		return getbalance(balance + cashcredit);
	}

}

