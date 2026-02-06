
public class SimpleInterest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      int p=500000;
      float r=6.8f;
      int t=5;
      float si=p*r*t/100;
      float a=p+si;
      System.out.println("Mr. Sarath Deposited a principle of Rs."+p+"/-");
      System.out.println("With a rate of interest "+r+"%");
      System.out.println("For a duration of " +t+ " years at Simple Interest");
      System.out.println("So the total interest he would gain after "+t+" years is Rs."+si+"/-");
      System.out.println("And the total amount he'll have at the end of "+t+" years is Rs."+a+"/-");
	}

}
