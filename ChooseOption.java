package fileHandling;

import java.io.IOException;
import java.util.Scanner;

public class ChooseOption {
	
	public void options() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Option to handle the files:" );
		System.out.println("1. Create a new File.\n2. Delete an Existing File. \n3. Read a file. \n4. Write in an existing file. \n5. Replace text in a file");
		int inp = sc.nextInt();
	switch(inp) {
	case 1:
		FileCreate f1 = new FileCreate();
		f1.newFileCreate();
		break;
	case 2:
		FileDelete f2 = new FileDelete();
		f2.filedelete();
		break;
	case 3:
		CheckListOfFiles f3 = new CheckListOfFiles();
		f3.result();
		break;
	case 4:
		FileWrite f4 = new FileWrite();
		f4.fileWrite();
		break;
	case 5:
		FileEdit f5 = new FileEdit();
		f5.modifyFile();
		break;
	default:
			System.out.println("Please choose right option");
			break;
	}
}
}
	
