package bufferedreader_example;
import java.io.*;

public class BufferedDemo {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the name:");
		String name=br.readLine();
		System.out.println("enter the age:");
		int age=Integer.parseInt(br.readLine());
		System.out.println("enter the salary:");
		double salary=Double.parseDouble(br.readLine());
		
		System.out.println("NAME:"+name);
		System.out.println("AGE:"+age);
		System.out.println("SALARY:"+salary);
	}

}
