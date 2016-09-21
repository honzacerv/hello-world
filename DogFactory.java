package pecinovsky.testy;

public class DogFactory {
	
	public static Dog getInstance(String criteria){
		if ( criteria.equals("small") )
		      return new Poodle();
		    else if ( criteria.equals("big") )
		      return new Rotwajler();
		    else if ( criteria.equals("working") )
		      return new Husky();

		    return null;
		
	}

}
