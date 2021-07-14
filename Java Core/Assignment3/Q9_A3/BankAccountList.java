package Capg;
	import java.util.ArrayList;
	import java.util.Collection;
	import java.util.Collections;
	import java.util.List;

	public class BankAccountList {

	    public static void main(String[] args) {


	        List<SavingAccount> sal = new ArrayList<>();

	        sal.add(new SavingAccount(2000, 002, "Sam", true));
	        sal.add(new SavingAccount(2300, 001, "Bob", true));
	        sal.add(new SavingAccount(1900, 004, "Tom", false));
	        sal.add(new SavingAccount(2300, 003, "Tony", false));
	        sal.add(new SavingAccount(5000, 005, "Sunny", true));
	        Collections.sort(sal);
	        System.out.println(sal);




	    }
	}
