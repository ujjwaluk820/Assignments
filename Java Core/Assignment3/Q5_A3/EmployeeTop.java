package Capg;
import java.util.HashMap;
     public class EmployeeTop {
	    public static void main(String[] args) {
	      
	        HashMap<Employee,String> epTable = new HashMap<>();
	        epTable.put(new Employee(2),"Tony");
	        epTable.put(new Employee(3),"Tom");
	        epTable.put(new Employee(4),"Sam");
	        epTable.put(new Employee(5),"Berrain");
	        for (Employee i : epTable.keySet()){
	            System.out.println(epTable.get(i));
	        
	    }
	}
}
