package oops;
class bike{
	public void bike() {
		System.out.println("bike");
	}
}
class tvs extends bike{
	public void tvs() {
		System.out.println("tvs method");
	}
}
class honda extends bike{
	public void honda() {
		System.out.println("honda method");
	}
}
public class hierarachalinheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tvs ob=new tvs();
		ob.bike();
		ob.tvs();
		honda n=new honda();
		n.bike();
		n.honda();
	}

}
