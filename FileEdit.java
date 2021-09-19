package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileEdit {
	Scanner sc = new Scanner(System.in);
	
	public void modifyFile() throws IOException  {
	
		System.out.println("Enter the filename");
		String file = sc.next();
		File file1=new File("\\C:\\Users\\Prushowth\\Desktop\\Simplilearn\\Project filehandling\\Newfiles\\"+file+".txt");
	System.out.println("Enter the old text to be replaced");
	String oldstring = sc.next();
	System.out.println("Enter the new text to be replaced with "+oldstring);
	String newstring = sc.next();
	String oldcontent="";
	FileReader fr;
		fr = new FileReader(file1);

	BufferedReader br = new BufferedReader(fr);
	String line = br.readLine();
	while(line!=null) {
		oldcontent = oldcontent+line+System.lineSeparator();
		line = br.readLine();
	}
	String newcontent = oldcontent.replaceAll(oldstring, newstring);
	FileWriter fw = new FileWriter (file1);
		fw.write(newcontent);
	System.out.println("Changes done");
	br.close();
	fw.close();
}
}

