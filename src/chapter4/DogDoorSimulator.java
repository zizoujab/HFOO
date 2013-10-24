package chapter4;

public class DogDoorSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DogDoor door = new DogDoor();
		door.addAllowedBark(new Bark("rowlf"));
		door.addAllowedBark(new Bark("rooowlf"));
		door.addAllowedBark(new Bark("rawlf"));
		door.addAllowedBark(new Bark("woof"));
		
		BarkRecongnizer recognizer  = new BarkRecongnizer(door);
		System.out.println("Bruce start barking .");
		recognizer.recongnize(new Bark("rowlf"));
		
		System.out.println("\nFido has gone outside ....");
		System.out.println("\nFido's all done ...");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException  e) {
			System.out.println("we got intterrupted in here ! exception ");
		}
		System.out.println("Bruce'all done ...");
		System.out.println("...  he's stock outside !");
		
		Bark smallDogBark = new Bark("yip");
		System.out.println("A small dog starts barking ");
		recognizer.recongnize(smallDogBark);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException  e) {
			System.out.println("we got intterrupted in here ! exception ");
		}
		System.out.println("\nBruce starts barking ..");
		recognizer.recongnize(new Bark("rooowlf"));
		
		
		System.out.println("\nFido's back inside");

	}

}
