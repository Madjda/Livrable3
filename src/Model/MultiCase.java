package Model;

public class MultiCase implements Case{
    private int NbChances = 3; 
    private int WinPoints =1;
    private int LostPoints =2;
	private char letter;
	
	public MultiCase(){
		System.out.println("You Created a multiChance");
		}
	
	
	public int CalculScore() {
		// TODO Auto-generated method stub
		return 0;
	}


	public int getNbChances() {
		return NbChances;
	}


	public void setNbChances(int nbChances) {
		NbChances = nbChances;
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
