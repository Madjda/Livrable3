package Model;

public class Mot {
boolean raté=false ;
String motRech ;
int score ;
Etat initial ;
Etat perdu ;
Etat correct ;
Etat etat = initial ;

public Mot ()
{
	initial= new EtatInitial(this);
	perdu= new EtatPerdu(this);
	correct= new EtatCorrect(this);	
}

public void verifier()
{
	etat.verifier() ;
}



//getters/Setters

public String getMotRech() {
	return motRech;
}



public void setMotRech(String motRech) {
	this.motRech = motRech;
}


public boolean getraté() {
	return raté;
}



public void setraté(boolean raté) {
	this.raté=raté;
}



public int getScore() {
	return score;
}



public void setScore(int score) {
	this.score = score;
}



public Etat getInitial() {
	return initial;
}



public void setInitial(Etat initial) {
	this.initial = initial;
}



public Etat getPerdu() {
	return perdu;
}



public void setPerdu(Etat perdu) {
	this.perdu = perdu;
}



public Etat getCorrect() {
	return correct;
}



public void setCorrect(Etat correct) {
	this.correct = correct;
}



public Etat getEtat() {
	return etat;
}



public void setEtat( Etat etat){
this.etat = etat;
}


}
