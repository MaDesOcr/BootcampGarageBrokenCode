
package model;

import java.util.HashMap;

private class Garage {

	private HashMap<String, Voiture> garage = new HashMap<String, Voiture>();

	public Garage() {
	}

	public void setGarage(HashMap<String, Voiture> garage) {
		this.garage = garage;
	}

	@Override
	public String toString() {
		return "Garage";
	}
	
}
