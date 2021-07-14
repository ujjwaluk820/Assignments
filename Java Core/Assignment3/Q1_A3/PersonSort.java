package Capg;
import java.util.Set;
import java.util.TreeSet;
public class PersonSort {
		public static void main(String[] args) {
			
			Person p1 = new Person("ram",80,176);
			Person p2 = new Person("stark",87,180);
			Person p3 = new Person("tony",75,172);
			Person p4 = new Person("zoya",75,167);
			Person p5 = new Person("sam",75,164);
			
//			System.out.println( p1.toString());
//			System.out.println( p2.toString());
			
			Set<Person> set = new TreeSet<>();
			set.add(p1);
			set.add(p2);
			set.add(p3);
			set.add(p4);
			set.add(p5);	
			System.out.println(set);
				
		

	}
}
