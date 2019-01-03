package Model;

public class ProposCase implements Case{
	    private int NbPs = 4; 
	    private int WinPoints =2;
	    private int LostPoints =1;
	    private char[] choices;
	    private char letter;
	
	public ProposCase(){
		
		
	   System.out.println("You Created a proposition");
       setChoices(new char[NbPs]);
	}
	
	private void GenerateChoices(){
		
	}
   
	public int CalculScore() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getNbPs() {
		return NbPs;
	}

	public void setNbPs(int nbPs) {
		NbPs = nbPs;
	}

	public int getWinPoints() {
		return WinPoints;
	}

	public void setWinPoints(int winPoints) {
		WinPoints = winPoints;
	}

	public int getLostPoints() {
		return LostPoints;
	}

	public void setLostPoints(int lostPoints) {
		LostPoints = lostPoints;
	}

	public char[] getChoices() {
		return choices;
	}

	public void setChoices(char[] choices) {
		this.choices = choices;
	}


	public void SetLetter(char c) {
		// TODO Auto-generated method stub
		this.letter = c;
		
	}

	
	public boolean LostWord() {
		// TODO Auto-generated method stub
		return false;
	}

	public char GetLetter() {
		// TODO Auto-generated method stub
		return letter;
	}

}
