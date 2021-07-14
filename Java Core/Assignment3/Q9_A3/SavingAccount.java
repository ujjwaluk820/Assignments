package Capg;
	import java.util.List;
	import java.util.Scanner;

	public class SavingAccount implements Comparable<SavingAccount> {

	    Scanner ip = new Scanner(System.in);
	    double acc_ID;
	    double acc_balance;
	    String accountHolderName;
	    boolean isSalaryAccount;

	    public SavingAccount(double acc_ID ,double acc_balance, String accountHolderName, boolean isSalaryAccount) {
	        this.acc_balance = acc_balance;
	        this.acc_ID = acc_ID;
	        this.accountHolderName = accountHolderName;
	        this.isSalaryAccount = isSalaryAccount;
	    }

	    public void withdraw(){
	        System.out.println("Please Enter the amount to be withdrawn");
	        int withdraw = ip.nextInt();

	        this.acc_balance -= withdraw;

	    }

	    public void deposit(){
	        System.out.println("Please Enter the amount that you want to deposit");
	        int doposit = ip.nextInt();

	        this.acc_balance += acc_balance;
	    }

	    public double getAcc_balance() {
	        return acc_balance;
	    }

	    public double getAcc_ID() {
	        return acc_ID;
	    }

	    public String getAccountHolderName() {
	        return accountHolderName;
	    }

	    public boolean isSalaryAccount() {
	        return isSalaryAccount;
	    }

	    public void setAcc_balance(double acc_balance) {
	        this.acc_balance = acc_balance;
	    }

	    public void setAcc_ID(double acc_ID) {
	        this.acc_ID = acc_ID;
	    }

	    public void setAccountHolderName(String accountHolderName) {
	        this.accountHolderName = accountHolderName;
	    }

	    public void setSalaryAccount(boolean salaryAccount) {
	        isSalaryAccount = salaryAccount;
	    }

	    @Override
	    public String toString() {
	        return "SavingAccount{" +
	                "acc_ID=" + acc_ID +
	                ", acc_balance=" + acc_balance +
	                ", accountHolderName='" + accountHolderName + '\'' +
	                ", isSalaryAccount=" + isSalaryAccount +
	                '}';
	    }

	    @Override
	    public int compareTo(SavingAccount o) {
	        if(this.getAcc_ID() > o.getAcc_ID()){
	            return 1;
	        }else if(this.getAcc_ID() < o.getAcc_ID()){
	            return -1;
	        }else{
	            return 0;
	        }
	    }
	}

