import java.util.Scanner;
public class Digitcount {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
        int n = sc.nextInt();
        int count=1;
        for(int i=1;i<=10;i++)
        {
        	n=n/10;
        	if(n!=0)
        	count++;
        }
        if(n==0)
    		System.out.println("it is a "+count+" digit number");
        	sc.close();
	}

}
