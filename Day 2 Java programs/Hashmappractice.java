import java.util.HashMap;
public class Hashmappractice 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashMap<Integer, String> students = new HashMap<>();
		students.put(8, "Tej");
		students.put(7, "Sai");
		students.put(5, "Basw");
		students.put(9, "Sonu");
		students.put(1, "Dany");
		students.put(3, "Jay");
          System.out.println("List of students and their marks");
		  for(Integer key : students.keySet()) 
		   {   
		    System.out.println("        "+students.get(key) + "   :            " +key);
	       }
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