import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class CmdRun {
	public static void main(String[] arg) {
		try 
		{ 
		// command is D:\pintu\ExecuterTestTry1111.exe
		Process p=Runtime.getRuntime().exec("cmd /c D:\\pintu\\ExecuterTestTry1111.exe"); 
		p.waitFor(); 
		BufferedReader reader=new BufferedReader(new InputStreamReader(p.getInputStream())); 
		String line=reader.readLine(); 
		while(line!=null) 
		{ 
		System.out.println(line); 
		line=reader.readLine(); 
		} 

		} 
		catch(IOException e1) {} 
		catch(InterruptedException e2) {} 

		System.out.println("Done"); 
	}
}
