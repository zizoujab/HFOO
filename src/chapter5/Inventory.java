package chapter5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import chapter5.InstrumentSpec.Builder;
import chapter5.InstrumentSpec.Type;
import chapter5.InstrumentSpec.Wood;


public class Inventory {
	private List<Instrument> inventory ;
	
	public Inventory() {
		inventory = new LinkedList<Instrument>();
	}
	
public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
	Instrument instrument  = null ;
	if (spec instanceof GuitarSpec ) {
		instrument  = new Guitar(serialNumber, price , (GuitarSpec) spec);
	}
	
	if (spec instanceof MandolinSpec ) {
		instrument  = new Mandolin(serialNumber, price , (MandolinSpec) spec);
	}
	inventory.add(instrument);
}

public Instrument getGuitar(String serialNumber ) {
	for (Iterator<Instrument> i = inventory.iterator() ; i.hasNext(); ) {
		Instrument guitar = (Instrument) i.next();
		if (guitar.getSerialNumber().equals(serialNumber)) {
			return guitar ;
		}
	}
	return null;
}

public List<Guitar> search(GuitarSpec searchGuitarSpec ) {
	List<Guitar> matchingGuitars = new ArrayList<Guitar>();
	for (Iterator<Instrument> i = inventory.iterator() ; i.hasNext(); ) {
		Guitar  guitar = (Guitar) i.next();
		// ignore serial number since its unique
		// igonre price since that's unique 
		if (searchGuitarSpec.matches(guitar.getSpec())) {
			matchingGuitars.add(guitar);
		}	
	}
	return matchingGuitars ;
}
public List<Mandolin> search(MandolinSpec searchMandolinSpec ) {
	List<Mandolin> matchingMandolin = new ArrayList<Mandolin>();
	for (Iterator<Instrument> i = inventory.iterator() ; i.hasNext(); ) {
		Mandolin  mandolin = (Mandolin) i.next();
		// ignore serial number since its unique
		// igonre price since that's unique 
		if (searchMandolinSpec.matches(mandolin.getSpec())) {
			matchingMandolin.add(mandolin);
		}	
	}
	return matchingMandolin ;
}

}
