package lab14;
import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import sun.security.util.ManifestDigester.Entry;

public class Stats {
	static Map<String, Integer> map = new HashMap<String, Integer>();
	
	public static HashMap<String, Integer> wins() throws IOException {
		
		File file = new File("");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		
		while (reader.readLine() != null) {
			String[] line = reader.readLine().split("[ ]+");
			Iterator<Entry> iterator = map.entrySet();
			if (iterator.hasNext()) {
				
			}
			
			if (line[0].equals("1")) {
				for (int i = 1; i < 6; i++) {
					map.put(line[i], 1);
				}
			}
		}

		
		return null;
		
	}
}
