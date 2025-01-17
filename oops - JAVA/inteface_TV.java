package oops;
interface TVremote{
	void turn_on();
}
interface smartremote extends TVremote{
	void smartturn_on();
}
class Tv implements smartremote{

	@Override
	public void turn_on() {
		// TODO Auto-generated method stub
		System.out.println("Manual turnon");
	}

	@Override
	public void smartturn_on() {
		// TODO Auto-generated method stub
		System.out.println("Smart turnon");
	}
	
}
public class inteface_TV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv ob=new Tv();
		ob.turn_on();
		ob.smartturn_on();
	}

}
