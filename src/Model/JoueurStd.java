package Model;

public class JoueurStd implements Joueur {
	
	int [] listScores ;
	int meilleurScore ;
	int score ;
	String pseudo ;
	
	public JoueurStd() {
	    this.meilleurScore = 0;
		this.score = 0;
	}
	public int[] getListScores() {
		return listScores;
	}
	public void setListScores(int[] listScores) {
		this.listScores = listScores;
	}
	public int getMeilleurScore() {
		return meilleurScore;
	}
	public void setMeilleurScore(int meilleurScore) {
		this.meilleurScore = meilleurScore;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	
	

}
