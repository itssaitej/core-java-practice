
public class Salary 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      int bsal=85000;
      int ta=15;
      int da=20;
      int hra=18;
      int pf=20;
      int tax=25;
      float Gsal=bsal+(ta+da+hra)*bsal/100;
      float Nsal=Gsal-(pf+tax)*bsal/100;
      System.out.println("Ms.Hima's Basic Salary is Rs."+bsal+"/- per month.");
      System.out.println("Her Gross Salary after adding the ta,da and hra amounts is Rs."+Gsal+"/-");
      System.out.println("Finally after considering the pf and tax amounts that will get cut, she gets Rs."+Nsal+"/- credited into her account by the end of the month.");
	}

}
