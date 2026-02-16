
public class MarksResult 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int math=80;
		int sc=70;
		int eng=75;
		int soc=50;
		int hin=76;
		
	    int total=math+sc+eng+soc+hin;
	    float avg=total/5;
	    
	    if(avg>40)
	    System.out.println("Result: PASS");
	    else
	    	System.out.println("Result: FAIL");	

	}

}
