import java.util.ArrayList;

public class Arraylistexample 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();
		names.add("Monday");
		names.add("Tuesday");
		names.add("Wednesday");
		names.add("Thursday");
		names.add("Friday");
		names.add("Saturday");
		names.add("Sunday");
		names.add("Salrday");
		names.remove("Salrday");
		
		for(String day : names) 
		{
            System.out.println(day);
        }

        System.out.println("First day: " + names.get(0));
        System.out.println("Total days: " + names.size());
	}

}
