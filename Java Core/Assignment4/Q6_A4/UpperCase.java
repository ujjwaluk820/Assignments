package Capg;
	import java.util.ArrayList;
	import java.util.function.UnaryOperator;
	 class Op implements UnaryOperator<String> {
		 public String apply(String s) {
			 return s.toUpperCase();
		 }
	 }

	 public class UpperCase {

		public static void main(String[] args) {
			
			ArrayList<String> list = new ArrayList<>();
			list.add("Dog");
			list.add("Cat");
			list.add("lion");
			list.add("bird");
			System.out.println("Contents of the list : " +list);
			list.replaceAll(new Op());
			System.out.println("Contents of the list after replace operation : \n" + list);
			

		

	}

}
