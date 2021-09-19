package fileHandling;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckListOfFiles {
	Scanner sc = new Scanner(System.in);
		public ArrayList<String> readFileList(String file) throws IOException{
			ArrayList<String> lines=new ArrayList<String>();
			lines=(ArrayList<String>) Files.readAllLines(Paths.get(file),StandardCharsets.UTF_8);
			return lines;
		}
		public void result() throws IOException {
			System.out.println("Enter the Filename to be read");
			String inp3 = sc.next();
			ArrayList<String> result1=readFileList("C:\\Users\\Prushowth\\Desktop\\Simplilearn\\Project filehandling\\Newfiles\\"+inp3+".txt");
			System.out.println(result1);
			sc.close();
		}
		
	}
