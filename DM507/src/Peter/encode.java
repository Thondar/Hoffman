package Peter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class encode {
	
    public static final Map< Integer, Integer > frequence
		= new HashMap<>();
	
   public static void letterCount(File file) {
	   System.out.println(file);
	   BufferedReader reader;
	try {
		reader = new BufferedReader( new FileReader(file) );
	
       String line;
       
       try {
		while( (line = reader.readLine()) != null ) {
			   for (int i = 0; i < line.length(); i++) { 
				 char c = line.charAt(i);
				 int ascii = (int) c;

				 if ( frequence.containsKey( ascii ) ) {
						int count = frequence.get( ascii );
						frequence.put( ascii, count + 1 );
					} else {
						frequence.put( ascii, 1 );
					}
				 
				 
				
			   }
		       
		   }
       } catch (FileNotFoundException e1) {
   		// TODO Auto-generated catch block
   		e1.printStackTrace();
   	}
	} catch (IOException e) {
		
		e.printStackTrace();
	}
    }
	
	
   public static void getLetter() {
	   
	   
	   for( Integer key : frequence.keySet() ) {
		   int ascii = key;
			 char chara = (char) ascii;
			 System.out.println(chara + " -> " + frequence.get(key));
           
		}
	  
   }
   
   
   public static ArrayList<occurrences> toArray() {
	   ArrayList<occurrences> list = new ArrayList();
	   for( Integer key : frequence.keySet() ) {
	      int ascii = key;
		  char chara = (char) ascii;
		  list.add(new occurrences1(key, frequence.get(key)));
       
	}
	   for (int i = 0; i < list.size(); i++) {
	   System.out.println(list.get(i).numbers());
	   }
	   return list;
   
   }
	

	public static void main(String[] args) {
		
		File file = new File( "C:\\Users\\Dr. Pete\\Desktop\\filtest\\verybug1.txt" );
		
		letterCount(file);
		
		for( Integer key : frequence.keySet() ) {
              System.out.println( key + " -> " + frequence.get(key));
		}
		System.out.println( "----------------------------------------------------- ");
//		getLetter();

		
		toArray();
		
		
		
		
		

	}

}
