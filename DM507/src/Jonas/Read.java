package Jonas;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Read {
	
	private static final Map< Integer, Integer > map = new HashMap<>();
	
	public static void readFile(File file){
		String line = null;
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(new BufferedInputStream(new FileInputStream(file))));
			while ((line = reader.readLine()) != null){
				
				byte[] list = line.getBytes();
				
				for (byte b : list){
					//System.out.println(b);
					map.compute((int) b, (c, l) -> {
						if ( l == null ) {
							return 1;
						} else {
							return l + 1;
						}
					});
				}
			}
			System.out.println(map);
		} catch (IOException e) {
			System.out.println("Failed to read file");
			e.printStackTrace();
		}
	}

}
