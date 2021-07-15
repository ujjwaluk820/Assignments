package Capg;
	import java.util.HashMap;
	public class Convert {

		public static void main(String[] args) {
			 HashMap<String,String> map = new HashMap<>();
		        StringBuilder s = new StringBuilder();
		        map.put("dog","animal1");
		        map.put("cat","animal2");
		        map.put("lion","animal3");
		        map.put("sparrow","animal4");
		     
		        for(HashMap.Entry<String,String> hme : map.entrySet())
		        {
		            String s1 = hme.getKey();
		            String s2 = hme.getValue();
		            s.append(s1).append(s2);
		        }
		        System.out.println(s);

	}
}
	 