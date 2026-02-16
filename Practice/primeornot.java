import java.util.Scanner;
public class primeornot {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
        int n = sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
        	if(n%i==0)
        		count++;
        }
        if(count==1)
        	System.out.println("the number is nether prime nor composite");
        else if(count==2)
        	System.out.println("the number "+n+" is prime");
        else
        	System.out.println("the number is composite");
        
        
        sc.close();
	}

}
