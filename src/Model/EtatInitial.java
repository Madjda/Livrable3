package Model;

public class EtatInitial implements Etat 
{
Mot mot ;
	
	public EtatInitial ( Mot mot) {
		this.mot= mot ;
	}
	
	public void verifier() {
		//Traitement de vérification
		if (mot.getraté()) {
			mot.setEtat(mot.getPerdu());
		}
		
		
	}

}