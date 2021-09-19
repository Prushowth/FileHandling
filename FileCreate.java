package fileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileCreate {
	Scanner sc = new Scanner(System.in);
	public void newFileCreate() throws IOException {
		System.out.println("Enter the Filename to be created");
		String newFileName = sc.next();
		File newFile = new File("\\C:\\Users\\Prushowth\\Desktop\\Simplilearn\\Project filehandling\\Newfiles\\"+newFileName+".txt");
		newFile.createNewFile();
		System.out.println("New file created");
		sc.close();
	}

}
