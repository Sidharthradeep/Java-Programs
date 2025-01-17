package controlstatements;

public class replace {

	public static void main(String[] args) {
		String str="Testing Training Centre";
		String rev="";
		String[] ar=str.split(" ");
		int len=ar.length;
		for(int i=0;i<len;i++)
		{	
			rev=ar[i]+" "+rev;
		}
		System.out.println(rev);
		
	}

}
