import java.util.Scanner;

public class sumofprime {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
        int n = sc.nextInt();
        int sum=0;
        for(int i = 1; i <=n; i++)
        {
        	int count=0;
            for(int j = 1; j <=i; j++)
            {
                if(i % j == 0)
                    count++; 
            }
             if(count==2)
             {
            System.out.println(i);
            sum=sum+i;
             }
         
         }
        System.out.println("Sum of these prime numbers= "+sum);
     sc.close();     
	}

}
