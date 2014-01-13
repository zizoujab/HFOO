package chapter5;

public class GuitarSpec extends InstrumentSpec {
	private int numStrings;

	public GuitarSpec(Builder builder, String model, Type type, Wood backWood,
			Wood topWood, int numStrings) {
		super(builder, model, type, backWood, topWood);
		this.numStrings = numStrings;
	}

	public int getNumStrings() {
		return numStrings;
	}

	public void setNumStrings(int numStrings) {
		this.numStrings = numStrings;
	}
	
	public boolean matches(InstrumentSpec otherSpec) {
		
		if(! (otherSpec instanceof GuitarSpec) ) {
			return false ;
		}
		GuitarSpec otherGuitarSpec = (GuitarSpec) otherSpec ;
		if(otherGuitarSpec.getNumStrings() != this.numStrings ) {
			return false ;
		}
		
		 return super.matches(otherGuitarSpec);
		
	}

	
	
}
