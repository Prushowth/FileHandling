package fileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileDelete {
	Scanner sc = new Scanner(System.in);
	
	public void filedelete() throws IOException {
		System.out.println("Enter the Filename to be Deleted");
		String deleteFileName = sc.next();
		Files.deleteIfExists(Paths.get("C:\\Users\\Prushowth\\Desktop\\Simplilearn\\Project filehandling\\Newfiles\\"+deleteFileName+".txt"));
		System.out.println("File removed, if it exisited in the folder");
		sc.close();
	}

}
