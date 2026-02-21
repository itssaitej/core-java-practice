import java.util.*;
public class trycatchpractice 
{

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int n; 
		String name;
		Scanner sc=new Scanner(System.in);
       
		try 
		{
		System.out.println("Enter your name");
        name=sc.nextLine();
        
        if (name.matches(".*\\d.*")) 
        {  // contains any digit
            throw new Exception("Name contains numbers");
            
        }
        
		}
		catch(Exception e)
		{
			 System.out.println("Invalid input. Name should contain only letters and spaces.");
			System.out.println("Please Re-Enter your name");
	        name=sc.next();
		}
		
		 
		try
		{
		    System.out.println("Enter a number to see whether it can divide 20");
		    n = sc.nextInt();

		    if (20 % n == 0)
		        System.out.println(n + " can divide 20");
		    else
		        System.out.println(n + " cannot divide 20");
		}
		catch (InputMismatchException e)
		{
		    System.out.println(name + ", you have entered letters instead of a number.");
		    sc.nextLine(); // 🔥 CLEAR BUFFER

		    System.out.println("Please Re-Enter a number to see whether it can divide 20");
		    n = sc.nextInt();

		    if (20 % n == 0)
		        System.out.println(n + " can divide 20");
		    else
		        System.out.println(n + " cannot divide 20");
		}
		catch (ArithmeticException e)
		{
		    System.out.println(name + ", a number cannot be divided by 0.");

		    System.out.println("Please Re-Enter a number to see whether it can divide 20");
		    n = sc.nextInt();

		    if (20 % n == 0)
		        System.out.println(n + " can divide 20");
		    else
		        System.out.println(n + " cannot divide 20");
		}

       sc.close();
       }
	}