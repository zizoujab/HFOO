package chapter1;



public class GuitarSpec {

	 private Builder builder;
	 private String model;
	 private Type type;
	 private Wood backWood;
	 private Wood topWood;
	 private int numStrings ;
	 
	 
	 
	 
	 public GuitarSpec(Builder builder, String model, Type type, Wood backWood,
			Wood topWood, int numStrings) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.numStrings = numStrings ;
	}
	public enum Type{
		 ACOUSTIC, ELECTRIC;
		 public String toString() {
			 switch(this) {
			 case ACOUSTIC : return "acoustic";
			 case ELECTRIC : return "electric";
			 default : return "";
			 }
		 }
	 }
	 public enum Builder{
		 FENDER,MATRIN,GIPSON,COLLINS,OLSON,RYAN,PRS,ANY;
		 
		 public String toString() {
			 switch(this) {
			 case FENDER 	: return "Fender";
			 case MATRIN 	: return "Martin";
			 case GIPSON 	: return "Gipson";
			 case COLLINS 	: return "Collins";
			 case OLSON 	: return "Olson";
			 case RYAN 		: return "Ryan";
			 case PRS 		: return "Prs";
			 case ANY 		: return "Any";
			 default 		: return "";
			 }
		 }
	 }
	 public enum Wood{
		 INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD,MAHOGANY,MAPLE,COCOBLO,CEDAR,ADIRONDACK,ALDER,STIKA;
		 
		 public String toString() {
			 switch(this) {
			 case INDIAN_ROSEWOOD 		: return "Indian Rosewood";
			 case BRAZILIAN_ROSEWOOD 	: return "Brazilian Rosewood";
			 case MAHOGANY 				: return "Mahogany";
			 case MAPLE 				: return "Maple";
			 case COCOBLO 				: return "Cocoblo";
			 case CEDAR 				: return "Cedar";
			 case ADIRONDACK 			: return "Adirondack";
			 case ALDER 				: return "Alder";
			 case STIKA 				: return "Stika";
			 default 					: return "";
			 
			 
			 }
		 }
	 }
	
	 public Builder getBuilder() {
		return builder;
	}
	public String getModel() {
		return model;
	}
	public Type getType() {
		return type;
	}
	public Wood getBackWood() {
		return backWood;
	}
	public Wood getTopWood() {
		return topWood;
	}
	public int getNumStrings() {
		return numStrings;
	}
	@Override
	public boolean equals(Object obj) {
		GuitarSpec comparedGuitarSpec = (GuitarSpec)obj;
		
		if ((comparedGuitarSpec.getBuilder()!= this.builder)){
			return false;
		}
		
		String model = comparedGuitarSpec.getModel().toLowerCase() ;
		if ((model!= null ) && (!model.equals(""))&& (!model.equals(this.model.toLowerCase()))){
			return false ;
		}
		
		
		if ((comparedGuitarSpec.getType()!= this.type)){
			return false ;
		}
		
		if ((comparedGuitarSpec.getBackWood() != this.backWood)){
			return false ;
		}
		
		if ((comparedGuitarSpec.getTopWood() != this.topWood)){
			return false ;
		}
		
		if (comparedGuitarSpec.getNumStrings() != this.numStrings ) {
			return false ;
		}
		
		return true;
	}
	
	 

}
