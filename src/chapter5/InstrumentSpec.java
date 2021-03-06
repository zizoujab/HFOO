package chapter5;	



public abstract class InstrumentSpec {

	 private Builder builder;
	 private String model;
	 private Type type;
	 private Wood backWood;
	 private Wood topWood;
	 
	 
	 
	 
	 
	 public InstrumentSpec(Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
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
	
	public boolean matches(InstrumentSpec comparedInstrumentSpec ){
		
		if ((comparedInstrumentSpec.getBuilder()!= this.builder)){
			return false;
		}
		
		String model = comparedInstrumentSpec.getModel().toLowerCase() ;
		if ((model!= null ) && (!model.equals(""))&& (!model.equals(this.model.toLowerCase()))){
			return false ;
		}
		
		
		if ((comparedInstrumentSpec.getType()!= this.type)){
			return false ;
		}
		
		if ((comparedInstrumentSpec.getBackWood() != this.backWood)){
			return false ;
		}
		
		if ((comparedInstrumentSpec.getTopWood() != this.topWood)){
			return false ;
		}
		
		
		return true;
	}

}
