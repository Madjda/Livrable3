package Model;

public class EtatInitial implements Etat 
{
Mot mot ;
	
	public EtatInitial ( Mot mot) {
		this.mot= mot ;
	}
	
	public void verifier() {
		//Traitement de v�rification
		if (mot.getrat�()) {
			mot.setEtat(mot.getPerdu());
		}
		
		
	}

}