package zizoujab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import zizoujab.GuitarSpec.Builder;
import zizoujab.GuitarSpec.Type;
import zizoujab.GuitarSpec.Wood;

public class Inventory {
	private List<Guitar> guitars ;
	
	public Inventory() {
		guitars = new LinkedList<Guitar>();
	}
	
public void addGuitar(String serialNumber, double price, Builder builder,
		String model, Type type, Wood backWood, Wood topWood) {
	GuitarSpec spec  = new GuitarSpec(builder, model, type, backWood, topWood);
	Guitar guitar = new Guitar(serialNumber, price,spec);
	guitars.add(guitar);
}

public Guitar getGuitar(String serialNumber ) {
	for (Iterator<Guitar> i = guitars.iterator() ; i.hasNext(); ) {
		Guitar guitar = (Guitar) i.next();
		if (guitar.getSerialNumber().equals(serialNumber)) {
			return guitar ;
		}
	}
	return null;
}

public List<Guitar> searchGuitar(GuitarSpec searchGuitarSpec ) {
	List<Guitar> matchingGuitars = new ArrayList<Guitar>();
	for (Iterator<Guitar> i = guitars.iterator() ; i.hasNext(); ) {
		Guitar guitar = (Guitar) i.next();
		// ignore serial number since its unique
		// igonre price since that's unique 
		GuitarSpec guitarSpec = guitar.getSpec();
		Builder builder  = searchGuitarSpec.getBuilder();
		if ((builder!= guitarSpec.getBuilder())){
			continue ;
		}
		
		String model = searchGuitarSpec.getModel().toLowerCase() ;
		if ((model!= null ) && (!model.equals(""))&& (!model.equals(guitarSpec.getModel().toLowerCase()))){
			continue ;
		}
		
		Type type = searchGuitarSpec.getType() ;
		if ((type!= guitarSpec.getType())){
			continue ;
		}
		
		Wood backWood  = searchGuitarSpec.getBackWood();
		if ((backWood!= guitarSpec.getBackWood())){
			continue ;
		}
		
		Wood topWood  = searchGuitarSpec.getTopWood();
		if ((topWood!= guitarSpec.getTopWood())){
			continue ;
		}
		matchingGuitars.add(guitar);
		
	}
	return matchingGuitars ;
}

}
