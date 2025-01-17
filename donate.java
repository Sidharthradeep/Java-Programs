package controlstatements;

public class donate {

	public static void main(String[] args) 
	{
		int age=18,weight=50;
		if(age>=18)
		{
			if(weight>=50) 
			{
				System.out.println("Can Donate blood");
			}
			else 
			{
				System.out.println("Weight not meet the requirements");
			}
		}
		else 
		{
			System.out.println("Age does not meet requirements");
		}

	}
}