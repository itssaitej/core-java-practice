import java.util.Scanner;
public class NaturalNums 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your highest natural number: ");
        int n = sc.nextInt();
        System.out.println("The natural numbers from 1-"+n+" are as follows:");
	  	for(int i=1;i<=n;i++)
	  	{
	  		System.out.println(i);
	  	}
	  	sc.close();
	}

}
