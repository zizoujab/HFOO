package chapter5;

import java.util.Iterator;
import java.util.List;

import chapter5.InstrumentSpec.Builder;
import chapter5.InstrumentSpec.Type;
import chapter5.InstrumentSpec.Wood;
import chapter5.MandolinSpec.Style;


public class FindGuitarTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		MandolinSpec whatEricLikes   = new MandolinSpec( Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, Style.F);
		List<Mandolin> matchingGuitars  = inventory.search(whatEricLikes);
		if ( !matchingGuitars.isEmpty() ) {
			for (Iterator<Mandolin> i = matchingGuitars.iterator() ; i.hasNext();) {
				Mandolin guitar = i.next();
				System.out.println("Eric , you might like this "+
						guitar.getSpec().getBuilder()+" "+guitar.getSpec().getModel()+" "+guitar.getSpec().getType()+ " guitar:\n"+
						guitar.getSpec().getBackWood() + " top.\nYou can have it for only $"+
						guitar.getPrice()+"!\n ------"
						
						);
			}
			
		} else {
			System.out.println("Sorry , Eric we have nothing for you.");
		}
		
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addInstrument("123", 100,new MandolinSpec ( Builder.ANY, "model", Type.ACOUSTIC, Wood.MAPLE, Wood.ALDER, Style.F));
		inventory.addInstrument("8888", 1499.95, new MandolinSpec( Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, Style.A));
		inventory.addInstrument("9999", 1499.95, new MandolinSpec( Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, Style.F));
	}

}
