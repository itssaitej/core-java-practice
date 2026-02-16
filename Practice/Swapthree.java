
public class Swapthree 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      int one=200;
      int two=400;
      int three=600;
      System.out.println("Before Swapping");
      System.out.println("First num="+one+"\t"+" Second num="+two+"\t"+" Third Num="+three);
      
      int temp=0;
      temp=one;
      one=two;
      two=three;
      three=temp;
      System.out.println("After first swapping");
      System.out.println("First num="+one+"\t"+" Second num="+two+"\t"+" Third Num="+three);
      
      temp=one;
      one=two;
      two=three;
      three=temp;
      System.out.println("After second swapping");
      System.out.println("First num="+one+"\t"+" Second num="+two+"\t"+" Third Num="+three);
	} 

}
