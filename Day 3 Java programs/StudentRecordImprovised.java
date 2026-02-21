import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class StudentRecordImprovised 
{

    public static void main(String[] args) 
    {

        HashMap<Integer, String> students = new HashMap<>();
        students.put(85, "Tej");
        students.put(76, "Sai");
        students.put(59, "Basw");
        students.put(96, "Sonu");
        students.put(61, "Dany");
        students.put(53, "Jay");

        System.out.println("Students List:");

        for (Map.Entry<Integer, String> entry : students.entrySet()) 
        {
            System.out.println(entry.getValue() + " : " + entry.getKey());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"))) 
        {
            for (Map.Entry<Integer, String> entry : students.entrySet()) 
            {
                bw.write(entry.getValue() + " : " + entry.getKey());
                bw.newLine();
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }

        System.out.println("\nFrom File:");

        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) 
        {
            String line;
            while ((line = br.readLine()) != null) 
            {
                System.out.println(line);
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }

        String topper = "";
        int maxMarks = Integer.MIN_VALUE;

        for (Map.Entry<Integer, String> entry : students.entrySet()) 
        {
            if (entry.getKey() > maxMarks) 
            {
                maxMarks = entry.getKey();
                topper = entry.getValue();
            }
        }

        double total = 0;
        for (int marks : students.keySet()) 
        {
            total += marks;
        }
        
        System.out.println("\nTopper: " + topper + " with " + maxMarks);
        System.out.println("Average: " + total / students.size());
    }
}
