
import model.Cat;
import model.Frog;
import model.Lion;
import model.Fox;
import model.TrappedZooKeeper;

public class AnimalNoise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat fluffy = new Cat();
		System.out.println(fluffy.speak());
		
		TrappedZooKeeper jamantha = new TrappedZooKeeper();
		System.out.println(jamantha.speak());
		
		Frog slimey = new Frog();
		System.out.println(slimey.speak());
		
		Lion Nala = new Lion();
		System.out.println(Nala.speak());
		
		Fox alexander = new Fox();
		System.out.println(alexander.speak());
		
		System.out.println("\nThe sentence, 'Nala is in a pack', is "+ Nala.getPackStatus() );
		System.out.println("Nala has "+ Nala.getSiblingNumber() +", siblings");
		System.out.println("Nala weights "+ Nala.getWeight()+ ", lbs." );
		
		Lion Tamala = new Lion();
		Tamala.setPackStatus(false);
		Tamala.setSiblingNumber(15);
		Tamala.setWeight(310);
		
		System.out.println("\nThe sentence, 'Tamala is in a pack', is "+ Tamala.getPackStatus() );
		System.out.println("Tamala has "+ Tamala.getSiblingNumber() +", siblings");
		System.out.println("Tamala weights "+ Tamala.getWeight()+ ", lbs." );
		
		Dog Zoe = new Dog();
		System.out.println(Zoe.speak());
		
	}

}
