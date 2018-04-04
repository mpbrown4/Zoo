import model.Cat;
import model.Frog;
import model.Horse;
import model.Fox;
import model.TrappedZooKeeper;
import model.Dog;

public class AnimalNoise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat fluffy = new Cat();
		System.out.println(fluffy.speak());
		
		TrappedZooKeeper jamantha = new TrappedZooKeeper();
		System.out.println(jamantha.speak());
		
		Frog slimey = new Frog();
		System.out.println(slimey.speak());
		
		Fox alexander = new Fox();
		System.out.println(alexander.speak());
		
		Dog Denver = new Dog();
		System.out.println(Denver.speak());
		
		Horse Rain = new Horse();
		System.out.println(Rain.speak());
	}
}
