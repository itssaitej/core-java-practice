import java.util.*;

public class StudentApp 
{
    public static void main(String[] args) throws Exception 
    {
    	int count;
    	String name;
    	int marks=0;
    	StudentService service = new StudentService();
        Scanner s = new Scanner(System.in);
        while(true) 
        {
            try 
            {
                System.out.print("How many students? ");
                count = s.nextInt();
               s.nextLine();
                break;
            } 
            catch(InputMismatchException e) 
            {
                System.out.println("Please enter a valid number!");
                s.nextLine();
            }
        }
        for(int i = 1; i <= count; i++) 
        {
         	while(true)
         	{
        	try
        	{
             System.out.print("Enter student name: ");
             name = s.nextLine();
            
        	
             if (name.matches(".*\\d.*")) 
             {  // contains any digit
                 throw new Exception("Name contains numbers");
             }
             break;
        	}
             
        	catch(Exception e)
    		{
   			 System.out.println("Invalid input. Name should contain only letters and spaces.");
   			 System.out.println("Please Re-Enter your name");
   	         name=s.next();
        	}
         	}
             while(true) 
             {
            	    try {
            	        System.out.print("Enter marks: ");
            	        marks = s.nextInt();
            	        s.nextLine();

            	        if(marks < 0 || marks > 100) 
            	        {
            	            System.out.println("Marks must be between 0 and 100.");
            	            continue;
            	        }

            	        break;   
            	    }
            	    catch(InputMismatchException e) 
            	    {
            	        System.out.println("Please enter numbers only....!");
            	        s.nextLine();   
            	    }
            
          }
             service.addStudent(name, marks);
        }
        service.saveToFile();
        service.loadFromFile();
        service.showStudents();
        
        Student top = service.getTopper();
        
        System.out.println("Topper: " + top.getName() + " " + top.getMarks());

        System.out.println("Average: " + service.getAverage());
        
        s.close();
    }
}