package model;

public class Voiture {

	
	//model, reserve d'essence, marche/arret
	private int nbRoues = 4;
	private final String MODEL;
	private int essence = 50;
	private boolean marche = false;
	
	

	@Override
	public String toString() {
		return "Voiture [nbRoues=" + nbRoues + ", model=" + MODEL + ", essence=" + essence + ", marche=" + marche + "]";
	}

	
}
