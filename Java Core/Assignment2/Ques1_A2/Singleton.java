
public class Singleton {
 
    private Singleton() {
  }

	 static Singleton instance = null;  

	 public static Singleton getInstance(){      
     if(instance == null)          
		 {
		   instance = new Singleton();   
	    }
			 return instance;
   }
}
