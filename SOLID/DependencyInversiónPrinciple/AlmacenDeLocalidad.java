package DependencyInversiónPrinciple;

import java.util.List;

public class AlmacenDeLocalidad implements administradorAlmacenes{
	
	double capacity = 5000;
	String inventory = "";
	

	public AlmacenDeLocalidad() {
		// TODO Auto-generated constructor stub
	}
	
	public double storageCapacity() {
		
		return capacity;
		
	}
	public String getLocalInventory() {
		return inventory;
		
	}


}
