
public class Swapfourwithout 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int one=200;
	       int two=400;
	       int three=600;
	       int four=800;
	       
	       System.out.println("Before swapping");
	       System.out.println("First num="+one+"\t"+" Second num="+two+"\t"+" Third Num="+three+ "\t"+" Fourth Num="+four);
	        
	       one=one+two+three+four;
	       two=one-two-three-four;
	       three=one-two-three-four;
	       four=one-two-three-four;
	       one=one-two-three-four;
	       System.out.println("After first swapping");
	       System.out.println("First num="+one+"\t"+" Second num="+two+"\t"+" Third Num="+three+ "\t"+" Fourth Num="+four);
	}

}
