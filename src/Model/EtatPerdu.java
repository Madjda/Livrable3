package Model;

public class EtatPerdu implements Etat {

Mot mot ;
	
	public EtatPerdu ( Mot mot) {
		this.mot= mot ;
	}
	
	public void verifier() {
		if (Main.nbMotRaté < Main.nbMotRatéMax) 
		{
			mot.setEtat(mot.getInitial());
		}
		
		else System.out.println("GAME OVER");
	}

}
