package Peter;


public class occurrences1 implements occurrences {


	    
	    

	    private int characters;
	    private int numbers;
	    
	    public occurrences1(int characters, int numbers){
	        this.characters = characters;
	        this.numbers = numbers;
	    }
	    
	    @Override
	    public int characters() {
	        return characters;
	       
	    }

	    @Override
	    public int numbers() {
	       return numbers; 
	    }
	    
	

}
