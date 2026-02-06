import java.util.Scanner;
public class Digitornot 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter your input: ");
	        char input = scanner.nextLine().charAt(0);
	        if (Character.isDigit(input)) 
	           System.out.println("The input '" +input+ "' is a digit.");    
	        else 
	          System.out.println("The input '" +input+ "' is not a digit.");

	        scanner.close();
	}

}
