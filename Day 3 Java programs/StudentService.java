import java.io.*;
import java.util.*;

public class StudentService 
{

    private List<Student> students = new ArrayList<>();

    public void addStudent(String name, int marks) 
    {
        students.add(new Student(name, marks));
    }

    public void saveToFile() throws IOException 
    {
        BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
        for(Student s : students) 
        {
            bw.write(s.getName() + "," + s.getMarks());
            bw.newLine();
        }
        bw.close();
    }

    public void loadFromFile() throws IOException 
    {
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String line;
        while((line = br.readLine()) != null) 
        {
            String[] parts = line.split(",");
            students.add(new Student(parts[0], Integer.parseInt(parts[1])));
        }
        br.close();
    }

    public void showStudents() 
    {
        for(Student s : students) 
        {
            System.out.println(s.getName() + " : " + s.getMarks());
        }
    }
    
    public Student getTopper() 
    {

        Student top = students.get(0);

        for(Student s : students) 
        {
            if(s.getMarks() > top.getMarks()) 
            {
                top = s;
            }
        }
        return top;
    }
    
    public double getAverage() 
    {

        int total = 0;

        for(Student s : students) 
        {
            total += s.getMarks();
        }
        return (double) total / students.size();
    }
}
