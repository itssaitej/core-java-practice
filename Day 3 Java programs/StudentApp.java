import java.util.*;

public class StudentApp 
{
    public static void main(String[] args) throws Exception 
    {

    	StudentService service = new StudentService();
        Scanner s = new Scanner(System.in);

        System.out.print("How many students?");
        int count = s.nextInt();
        s.nextLine(); 

        for(int i = 1; i <= count; i++) 
        {
            System.out.print("Enter student name: ");
            String name = s.nextLine();

            System.out.print("Enter marks: ");
            int marks = s.nextInt();
            s.nextLine();

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
