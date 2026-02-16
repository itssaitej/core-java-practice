import java.util.Scanner;

public class Armstrongnum 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
        int n = sc.nextInt(); 
		int originalNumber; 
		int powcalnumber;
		int remainder=0; 
		int p=0;
		int result = 0;

        originalNumber = n;
        powcalnumber=n;
        while(powcalnumber!=0)
        {
        	powcalnumber/=10;
        	p=p+1;
        }
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, p);
            originalNumber /= 10;
        }

        if(result == n)
            System.out.println(n+ " is an Armstrong number.");
        else
            System.out.println(n+ " is not an Armstrong number.");
        sc.close();
	}
	}