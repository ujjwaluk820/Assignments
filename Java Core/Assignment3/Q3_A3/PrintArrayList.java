package Capg;
	  
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	public class PrintArrayList {
		public static void main(String[] args) {  
	        List<String> list = new ArrayList<String>();  
	        list.add("Dog");  
	        list.add("Cat");  
	        list.add("Crow");  
	        list.add("Bird");  
	        System.out.println("Before Reversing");  
	        System.out.println(list.toString());  
	          
	        Collections.reverse(list);  
	        System.out.println("After Reversing");  
	        System.out.println(list);

	}
	}