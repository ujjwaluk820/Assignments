package Capg;
	import java.util.*;
	public class HashSets {
	public static void main(String[] args) {
			
			 Set<Integer> hset = new HashSet <>();
			 Set<Integer> lset = new LinkedHashSet <>();
			 int[] a= {6,21,23,2,28,8,4,11};
			 
			 for(int e:a) {
				 hset.add(e);
				 lset.add(e);
			 }
			 
			 System.out.println("HashSet  " + hset);
			 System.out.println("LinkedHashSet " + lset);
		}

	}

