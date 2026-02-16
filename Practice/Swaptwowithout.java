
public class Swaptwowithout {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       int one=240;
       int two=360;
       System.out.println("Before swapping");
       System.out.println("First num="+one+"\t"+" Second num="+two);
       
       one=one+two;
       two=one-two;
       one=one-two;
       
       System.out.println("After swapping");
       System.out.println("First num="+one+"\t"+" Second num="+two);
       
	}
}
