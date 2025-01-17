package controlstatements;

public class sumof10 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<=10;i++)
		{
			System.out.println(sum+i);
			sum=sum+i;
		}
		System.out.println("Total sum is "+sum);

	}

}
