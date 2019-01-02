package Model;

public class EtatCorrect implements Etat {
Mot mot ;


public EtatCorrect ( Mot mot) {
	this.mot= mot ;
}


public void verifier() {
	
	if (Main.nbMotCorrect < Main.nbMotMax) 
	{
		mot.setEtat(mot.getInitial());
	}
	
	else System.out.println("You Win");
	
}
}
