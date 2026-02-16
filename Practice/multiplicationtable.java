import java.util.Scanner;
public class multiplicationtable {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number for which you want the table for:");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++)
        {
        	System.out.println(n+"x"+i+"="+n*i);
        }
        sc.close();
	}

}
