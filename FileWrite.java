package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {
	Scanner sc = new Scanner(System.in);
	public void fileWrite() throws IOException {
		System.out.println("Enter the file name to be written");
		String writeFileName = sc.next();
		File file2 = new File("\\C:\\Users\\Prushowth\\Desktop\\Simplilearn\\Project filehandling\\Newfiles\\"+writeFileName+".txt");
		FileWriter writer = new FileWriter(file2);
		String data1 = sc.next();
		writer.write(data1);
		System.out.println("data entered to the file "+writeFileName+".txt");
		writer.close();
	}

	}

