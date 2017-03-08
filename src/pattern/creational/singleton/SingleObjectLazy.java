package pattern.creational.singleton;

public class SingleObjectLazy {
	
	   //create an object of SingleObject // Eager
	   private static SingleObjectLazy instance;

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private SingleObjectLazy(){}

	   //Get the only object available
	   public static SingleObjectLazy getInstance(){
		  if( instance == null)
			  return new SingleObjectLazy();
		  else 
			  return instance;
	   }

	   public void showMessage(){
	      System.out.println("Lazy: Hello World!");
	   }

}
