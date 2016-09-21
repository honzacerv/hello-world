package pecinovsky.testy;

public class JavaFactoryPatternExample {
	
	 public static void main(String[] args)
	  {
	    // create a small dog
	    Dog dog = DogFactory.getInstance("small");
	    dog.speak();

	    // create a big dog
	    dog = DogFactory.getInstance("big");
	    dog.speak();

	    // create a working dog
	    dog = DogFactory.getInstance("working");
	    dog.speak();
	  }

}
