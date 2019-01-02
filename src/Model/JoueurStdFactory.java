package Model;

public class JoueurStdFactory implements JoueurFactory {
	
	
	public Joueur createJoueur() {
		JoueurStd j = new JoueurStd ();
		return j ;
	}

	
	
}
