package Capg;
	class Person implements Comparable<Person>{
		private String name;
		private int weight;
		private int height;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public Person(String name, int weight, int height) {
			super();
			this.name = name;
			this.weight = weight;
			this.height = height;
		}
		@Override
		public String toString() {
			return "Person [name=" + name + ",  weight=" + weight + ", height=" + height + "]";
		}
		@Override
		public int compareTo(Person x) {
			
			if(this.weight==x.getWeight()){	
				
				if(this.height==x.getHeight())
					return 0;
				else if(this.height>x.getHeight()) 
					return 1;
				else
					return-1;
			}else if(this.weight>x.getWeight()) {
				return 1;
			}else {
				return -1;
				}
		
		}
		
			
	}

