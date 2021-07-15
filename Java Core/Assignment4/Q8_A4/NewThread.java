package Capg;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.function.Consumer;
	
	public class NewThread {
		public static void main(String[] args) {
			 List<Integer> list = new ArrayList<>();
		        list.add(12345);
		        list.add(6789);
		        list.add(9876);
		        list.add(67895);
		        
		        Consumer<List<Integer>> iterate = a-> {a.forEach(System.out::println);};
		        Thread t = new Thread(()-> iterate.accept(list));
		        t.start();

	}
}
