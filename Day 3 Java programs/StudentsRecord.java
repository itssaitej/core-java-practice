import java.io.*;
import java.util.HashMap;

public class StudentsRecord 
{

	public static void main(String[] args) throws Exception 
	{
		HashMap<Integer, String> students = new HashMap<>();
		students.put(85, "Tej");
		students.put(76, "Sai");
		students.put(59, "Basw");
		students.put(96, "Sonu");
		students.put(61, "Dany");
		students.put(53, "Jay");
          System.out.println("List of students and their marks");
		  
          for(Integer key : students.keySet()) 
		   {   
		    System.out.println("        "+students.get(key) + "   :            " +key);
	       }
		  
		  FileWriter fw = new FileWriter("data.txt");
	        BufferedWriter bw = new BufferedWriter(fw);
	        
	        for(Integer key : students.keySet()) 
			   {   
	        	
	        	bw.write(students.get(key) + "   :   " +key);
	        	
	        	bw.newLine();
		       }
	        bw.close(); 
	        
	        FileReader fr = new FileReader("data.txt");
	        BufferedReader br = new BufferedReader(fr);

	        String line;  
	        while ((line = br.readLine()) != null) {
	            System.out.println(line);
	        }

	        br.close();
	        
	        String topper = "";
		     int maxMarks = Integer.MIN_VALUE;

		        for (HashMap.Entry<Integer, String> entry : students.entrySet()) 
		        {
		            if (entry.getKey() > maxMarks) 
		             {
		                maxMarks = entry.getKey();
		                topper = entry.getValue();
		             }
		        }
		        System.out.println("Highest Marks by: " + topper+ ":"+ maxMarks);
		        
		        double total = 0;
		        for (int marks : students.keySet()) 
		        {
		            total += marks;
		        }
		        double average = total / students.size();
		        System.out.println("Average Marks: " + String.format("%.2f", average));
	}

}
