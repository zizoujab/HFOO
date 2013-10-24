package chapter4;

public class Bark {
	
	private String sound ;

	public Bark(String sound) {
		this.sound = sound;
	}
	

	@Override
	public boolean equals(Object bark) {
		if ( bark instanceof Bark ) {
			Bark otherBark  = (Bark) bark ;
			if ( otherBark.getSound().equalsIgnoreCase(this.sound)) {
				return true ;
			}
		}
		
		return false ;
	}

	public String getSound() {
		return sound;
	} 
	
	

}
