
public class Swapthreewithout 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       int one=200;
       int two=400;
       int three=600;
       
       System.out.println("Before swapping");
       System.out.println("First num="+one+"\t"+" Second num="+two+"\t"+" Third Num="+three);
        
       one=one+two+three;
       two=one-two-three;
       three=one-two-three;
       one=one-two-three;
       System.out.println("After first swapping");
       System.out.println("First num="+one+"\t"+" Second num="+two+"\t"+" Third Num="+three);
       
		/*
		 * one=one+two+three; two=one-two-three; three=one-two-three; one=one-two-three;
		 * System.out.println("After second swapping");
		 * System.out.println("First num="+one+"\t"+" Second num="+two+
		 * "\t"+" Third Num="+three);
		 */
	}

}
