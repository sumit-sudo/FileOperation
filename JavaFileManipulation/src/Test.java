import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test {

	
	public void readFile() throws IOException
	{
		/*
		 * Reason to use BufferedReader :-
		 * 1) Most enhance version of Reader class as It can read char by char as well as line by line
		 */
		
		// 
		FileReader f1=new FileReader("C:\\Users\\Sumit\\Desktop\\Mockito\\Test.txt");
		
		BufferedReader bf=new BufferedReader(f1);
		int count=0;
		String str="";
		while(bf.ready())
		{
			count++;
			char read = (char)bf.read();
			str=str+read;
			//System.out.println(read);
		}
		System.out.println("character count"+count);
		System.out.println("String insode File == "+str);
		
		f1.close();
		bf.close();
	}
	public void readFileByLine() throws IOException

	{
		/*
		 * Reason to use BufferedReader :-
		 * 1) Most enhance version of Reader class as It can read char by char as well as line by line
		 */

		FileReader f1=new FileReader("C:\\Users\\Sumit\\Desktop\\Mockito\\Test.txt");
		
		BufferedReader bf=new BufferedReader(f1);
		int count=0;
		String str="";
		while(bf.ready())
		{
			count++;
			System.out.println(bf.readLine());
			str=str+bf.readLine();
		}
		
		System.out.println("line count"+count);
		System.out.println("String inside file"+ str);
		f1.close();
		bf.close();
		
	}
	public void writeIntoFile() throws IOException
	{
		/*
		 * FileWriter("filename",true), If we mention boolean value true in the second parameter then
		 * append mode will be on else only write mode to the file will be on.
		 */
		FileWriter fw=new FileWriter("C:\\Users\\Sumit\\Desktop\\Mockito\\Test.txt",true);
		PrintWriter pw=new PrintWriter(fw);
		
		//pw.write('S');// same line
		pw.println("XXXXX");
		//pw.println(500);
		pw.flush();
		fw.close();
		
	}
	
}
