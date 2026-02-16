import java.util.Scanner;
public class oddsum {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your highest natural number: ");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++)
        {
        	if(i%2!=0)
        		sum=sum+i;
        }
        System.out.println("sum of the odd numbers from 1-"+n+"= "+sum);
        sc.close();
	}

}
