package chapter4;

import java.util.Iterator;



public class BarkRecongnizer {

	private DogDoor door ;
	
	public BarkRecongnizer(DogDoor door) {
		this.door  = door ;
	}
	
	public void recongnize(Bark bark ) {
		System.out.println(" BarkRecongnizer : Heard a '"+bark.getSound()+"'");
		Iterator<Bark> barks = door.getAllowedBarks().iterator();
		while( barks.hasNext()) {
			Bark doorsBark = (Bark) barks.next();
			if (doorsBark.equals(bark)) {
				door.open();
				return ;
			}
				
		}
		System.out.println("this dog is not allowed .");
		
	}
}
