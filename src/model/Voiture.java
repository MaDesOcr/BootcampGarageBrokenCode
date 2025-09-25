package model;

public class Voiture {

	
	//model, reserve d'essence, marche/arret
	private int nbRoues = 4;
	private final String MODEL;
	private int essence = 50;
	private boolean marche = false;
	
	

	public Voiture(String mODEL) {
		super();
		MODEL = mODEL;
	}



	public int getNbRoues() {
		return nbRoues;
	}



	public void setNbRoues(int nbRoues) {
		this.nbRoues = nbRoues;
	}



	public int getEssence() {
		return essence;
	}



	public void setEssence(int essence) {
		this.essence = essence;
	}



	public boolean isMarche() {
		return marche;
	}



	public void setMarche(boolean marche) {
		this.marche = marche;
	}



	public String getMODEL() {
		return MODEL;
	}



	@Override
	public String toString() {
		return "Voiture [nbRoues=" + nbRoues + ", model=" + MODEL + ", essence=" + essence + ", marche=" + marche + "]";
	}

	
}
