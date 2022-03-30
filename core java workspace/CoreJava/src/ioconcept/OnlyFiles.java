package ioconcept;

import java.io.File;

public class OnlyFiles {
   public static void main(String[] args) throws Exception {
	
	   File f = new File("F:\\Folder IO");
	   
	   String[] list = f.list();
		for (int i = 0; i < list.length; i++) {
			if (f.isFile()) {
				System.out.println((i + 1) + " : " + list[i]);
			}
		}
	}
}
