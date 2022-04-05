import java.io.IOException;

public class MainClass {
	public static void main(String arg[]) throws IOException
	{
		Test obj=new Test();
		obj.writeIntoFile();
		obj.readFile();
		//obj.readFileByLine();
	}
}
