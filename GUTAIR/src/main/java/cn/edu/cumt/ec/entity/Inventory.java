package cn.edu.cumt.ec.entity;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
private List<guitar1> guitars;

  public Inventory() {
    guitars = new LinkedList<guitar1>();
  }

  public void addGuitar(String serialNumber, double price,
                        GuitarSpec spec) {
	  guitar1 guitar = new guitar1(serialNumber, price, spec);
     guitars.add(guitar);
  }

  public guitar1 getGuitar(String serialNumber) {
    for (Iterator<guitar1> i = guitars.iterator(); i.hasNext(); ) {
      guitar1 guitar = (guitar1)i.next();
      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }
    return null;
  }

  public List<guitar1> search(GuitarSpec searchSpec) {
    List<guitar1> matchingGuitars = new LinkedList<guitar1>();
    for (Iterator<guitar1> i = guitars.iterator(); i.hasNext(); ) {
      guitar1 guitar = (guitar1)i.next();
      if (guitar.getSpec().matches(searchSpec))
        matchingGuitars.add(guitar);
    }
    return matchingGuitars;
  }
}