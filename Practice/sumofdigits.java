import java.util.Scanner;
public class sumofdigits 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
        int n = sc.nextInt();
        int t=n;
        int k=n;
        int sum=0;
        int count=1;
        for(int i=1;i<=10;i++)
        {
        	n=n/10;
        	if(n!=0)
        	count++;
        }
        
        for(int i=0;i<count;i++)
        {
        	sum=sum+t%10;
        	t=t/10;
        }
        System.out.println("sum of the digits of "+k+" is "+sum);
        sc.close();
	}

}
