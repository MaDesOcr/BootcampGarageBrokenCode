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



	public Voiture(int nbRoues, String mODEL, int essence, boolean marche) {
		super();
		this.nbRoues = nbRoues;
		MODEL = mODEL;
		this.essence = essence;
		this.marche = marche;
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
		return nbRoues + "," + MODEL + ","+ essence + ","+ marche;
	}

	
}
