package Capg;
	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.Map;
	import java.util.Set;
	import java.util.concurrent.ConcurrentHashMap;

	public class TestFailFastAndSafe {

		public static void main(String[] args) {

			
			Map<String,String> student=new  ConcurrentHashMap<>();
			student.put("Tom","Delhi");
			student.put("Bob","Rajasthan");
			student.put("Sam","Kolkata");
			student.put("Tony","Himachal");
			student.put("Garry","Mumbai");
			
			Set<String> key = student.keySet();

			Iterator<String> it = key.iterator();
			while(it.hasNext())
			{
				String name;
				name = it.next();
				student.put("Suresh", "Banglore"); 
				System.out.println("name: "+ name +"\t place: "+ student.get(name));
				
			}
			
		}

	}

