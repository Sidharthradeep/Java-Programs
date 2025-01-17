package oops;


interface show{
	public void speeddetails();
	void accelarate();
	}
interface n1 extends show{
	public void run();
}
class tuv implements show,n1{

	@Override
	public void speeddetails() {
		// TODO Auto-generated method stub
		System.out.println("Show speed details");
	}
	@Override
	public void accelarate() {
		// TODO Auto-generated method stub
		System.out.println("Accerlarated");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run");
	}
	
}
public class interface_progrm {

	public static void main(String[] args) {
	tuv ob=new tuv();
	ob.accelarate();
	ob.run();
	ob.speeddetails();

	}

}
