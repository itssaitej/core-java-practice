import java.util.Scanner;
public class primenumbs 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
        int n = sc.nextInt();
        
        for(int i = 2; i <=n; i++)
        {
        	int count=0;
            for(int j = 1; j <=i; j++)
            {
                if(i % j == 0)
                    count++;
            }
            if(count==2)
                System.out.println(i);          
         }     
     sc.close(); 
    }
}