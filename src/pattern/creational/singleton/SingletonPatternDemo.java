package pattern.creational.singleton;

public class SingletonPatternDemo {
	   public static void main(String[] args) {

	      //illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	      //SingleObject object = new SingleObject();

	      //Get the only object available
	      SingleObjectEager objectEager = SingleObjectEager.getInstance();
	      //show the message
	      objectEager.showMessage();
	      
	      
	      //Get the only object available
	      SingleObjectLazy objectLazy = SingleObjectLazy.getInstance();
	      //show the message
	      objectLazy.showMessage();
	      
	   }
	}