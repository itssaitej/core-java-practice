
public class Swapfour {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      int one=200;
      int two=400;
      int three=600;
      int four=800;
      
      System.out.println("Before Swapping");
      System.out.println("First num="+one+"\t"+" Second num="+two+"\t"+" Third Num="+three+ "\t"+" Fourth Num="+four);
	  
      int temp=0;
      
      temp=one;
      one=two;
      two=three;
      three=four;
      four=temp;
      
      System.out.println("After Swapping");
      System.out.println("First num="+one+"\t"+" Second num="+two+"\t"+" Third Num="+three+ "\t"+" Fourth Num="+four);		  
	}

}
