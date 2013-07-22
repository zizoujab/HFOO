package chapter1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import chapter1.GuitarSpec.Builder;
import chapter1.GuitarSpec.Type;
import chapter1.GuitarSpec.Wood;


public class Inventory {
	private List<Guitar> guitars ;
	
	public Inventory() {
		guitars = new LinkedList<Guitar>();
	}
	
public void addGuitar(String serialNumber, double price, Builder builder,
		String model, Type type, Wood backWood, Wood topWood,int numStrings) {
	GuitarSpec spec  = new GuitarSpec(builder, model, type, backWood, topWood,numStrings);
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
		if (guitarSpec.equals(searchGuitarSpec)) {
			matchingGuitars.add(guitar);
		}
		
		
	}
	return matchingGuitars ;
}

}
