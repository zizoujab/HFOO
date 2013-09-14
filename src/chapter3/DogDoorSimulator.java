package chapter3;

public class DogDoorSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DogDoor door = new DogDoor();
		BarkRecongnizer recognizer  = new BarkRecongnizer(door);
		System.out.println("Fido barks to go outside ... ");
		recognizer.recongnize("Woof");
		
		System.out.println("\nFido has gone outside ....");
		System.out.println("\nFido's all done ...");
		
		
		try {
			Thread.sleep(600);
			
		} catch (InterruptedException  e) {
			System.out.println("we got intterrupted in here ! exception ");
		}
		System.out.println("... but he's stock outside !");
		System.out.println("\nFido starts barking ..");
		recognizer.recongnize("Woof");
		
		
		System.out.println("\nFido's back inside");

	}

}
