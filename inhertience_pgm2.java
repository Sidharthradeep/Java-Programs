package oops;
interface basicanimal{
	void eat();
	void sleep();
}
class Monkey{
	public void jump() {
		System.out.println("jump");
	}
	public void bite() {
		System.out.println("bite");
	}
}
class human extends Monkey implements basicanimal{

	public void speak() {
		System.out.println("speak");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eat");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Sleep");
	}
}
public class inhertience_pgm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		human ob=new human();
		ob.bite();
		ob.eat();
		ob.sleep();
		ob.jump();
		ob.speak();
	}

}
