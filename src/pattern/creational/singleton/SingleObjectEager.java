package pattern.creational.singleton;

public class SingleObjectEager {

	   //create an object of SingleObject // Eager
	   private static SingleObjectEager instance = new SingleObjectEager();

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private SingleObjectEager(){}

	   //Get the only object available
	   public static SingleObjectEager getInstance(){
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("Eager: Hello World!");
	   }

}
