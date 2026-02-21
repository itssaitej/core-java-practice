import java.io.*;
public class FwBwFrBr 
{

	public static void main(String[] args) 
		throws Exception 
		{

	        FileWriter fw = new FileWriter("data.txt");
	        BufferedWriter bw = new BufferedWriter(fw);

	        bw.write("Hello Java");
	        bw.newLine();
	        bw.write("I am learning File Handling today...!");
	        bw.newLine();
	        bw.write("So.....Cheer Me Up.");
	        bw.close();   

	        System.out.println("Data is written...!");

	        
	        FileReader fr = new FileReader("data.txt");
	        BufferedReader br = new BufferedReader(fr);

	        String line;
	        System.out.println("\nReading file content:\n");

	        while ((line = br.readLine()) != null) {
	            System.out.println(line);
	        }

	        br.close();

	}

}
