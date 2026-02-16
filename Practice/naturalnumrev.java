import java.util.Scanner;
public class naturalnumrev {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a natural number");
        int n = sc.nextInt();
        System.out.println("The natural numbers in the reverse order starting from "+n+" is as follows");
        for(int i=n;i>0;i--)
        	System.out.println(i);
        sc.close();
	}

}
