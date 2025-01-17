package oops;
class father{
	public void education() {
		System.out.println("MCA");
	}
	public void job() {
		System.out.println("Test");
	}
}
class son extends father{

	@Override
	public void education() {
		System.out.println("Btech");
		super.education();
	}

	@Override
	public void job() {
		System.out.println("Developer");
		super.job();
	}
	
}
public class method_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son ob=new son();
		ob.education();
		ob.job();
	}

}
