public class Swaptwo 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numone=200;
		int numtwo=500;
		//Before Swapping
        System.out.println("First number=" +numone+ "\t"+" Second number="+numtwo );
		int temp=0;
		
		temp=numone;
		numone=numtwo;
		numtwo=temp;
		//After Swapping
		System.out.println("First number=" +numone+ "\t"+" Second number="+numtwo );
	}

}
