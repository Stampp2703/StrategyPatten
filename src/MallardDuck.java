
public class MallardDuck extends Duck {
	public MallardDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyWithWing();
		
	}

	@Override
	public void display() {
			System.out.println("I'm, a real Mallard Duck");
	}

}
