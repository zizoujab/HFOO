package zizoujab;

import java.util.Iterator;
import java.util.List;

import zizoujab.GuitarSpec.Builder;
import zizoujab.GuitarSpec.Type;
import zizoujab.GuitarSpec.Wood;

public class FindGuitarTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		GuitarSpec whatEricLikes   = new GuitarSpec( Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		List<Guitar> matchingGuitars  = inventory.searchGuitar(whatEricLikes);
		if ( !matchingGuitars.isEmpty() ) {
			for (Iterator<Guitar> i = matchingGuitars.iterator() ; i.hasNext();) {
				Guitar guitar = i.next();
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
		inventory.addGuitar("123", 100, Builder.ANY, "model", Type.ACOUSTIC, Wood.MAPLE, Wood.ALDER);
		inventory.addGuitar("8888", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		inventory.addGuitar("9999", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
	}

}
