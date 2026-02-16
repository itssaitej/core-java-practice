import java.util.Scanner;

public class EvenandOddnums {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your highest natural number: ");
        int n = sc.nextInt();
        System.out.println("The even numbers from 1-"+n+" are as follows:");
	  	for(int i=1;i<=n;i++)
	  	{
	  		if(i%2==0)
	  		System.out.println(i);
	  	}
	  	sc.close();
	}

}
