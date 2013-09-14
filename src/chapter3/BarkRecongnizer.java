package chapter3;

public class BarkRecongnizer {

	private DogDoor door ;
	
	public BarkRecongnizer(DogDoor door) {
		this.door  = door ;
	}
	
	public void recongnize(String bark ) {
		System.out.println(" BarkRecongnizer : Heard a '"+bark+"'");
		door.open();
	}
}
