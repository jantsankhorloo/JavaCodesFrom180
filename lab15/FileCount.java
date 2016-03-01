package lab15;

import java.io.File;

public class FileCount {
	public static int fileCount(File file) {
		int total = 1;
		File[] files = file.listFiles();
		for (File f : files) {
			System.out.println(f);
		    if (f.isDirectory()) {
		        total += fileCount(f);
		    }
		    else 
		        total++;		    
		}
		return total;
	}
	
	public static void main(String[] args) {
		File file = new File("/homes/jamgalan/cs180/test");
		System.out.println(FileCount.fileCount(file));
	}
}
