package chapter5;



public class MandolinSpec extends InstrumentSpec {
	private Style style ;
	 

	public MandolinSpec(Builder builder, String model, Type type, Wood backWood,
			Wood topWood, Style style ) {
		super(builder, model, type, backWood, topWood);
		this.style = style ;
		
	}
	 
	public enum Style {
		A,F;
		
		public String  toSting() {
			switch(this) {
			case A : return "A";
			case F : return "F";
			default : return "";
			}
		}
	}
	
	public Style getStyle() {
		return style;
	}

	public void setStyle(Style style) {
		this.style = style;
	}
	
	public boolean matches(InstrumentSpec otherSpec) {
		if (!(otherSpec instanceof MandolinSpec )) {
			return false ;
		}
		MandolinSpec otherMandolinSpec = (MandolinSpec)otherSpec;
		if ( ! this.style.equals(otherMandolinSpec.getStyle())) {
			return false ;
		}
		
		return super.matches(otherMandolinSpec);
	}
	

}
