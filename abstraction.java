package oops;
abstract class car{
	abstract public void startengine();
	abstract public void startcar();
	public void clr() {
		System.out.println("Black");
	}
}
class kia extends car{

	@Override
	public void startengine() {
		System.out.println("startengine");
		
	}

	@Override
	public void startcar() {
		System.out.println("starting car");
		
	}
	
}
public class abstraction {

	public static void main(String[] args) {
		kia ob=new kia();
		ob.clr();
		ob.startcar();
		ob.startengine();

	}

}
