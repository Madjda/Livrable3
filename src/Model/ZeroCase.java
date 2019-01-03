package Model;

public class ZeroCase implements Case {
	 
	    private int WinPoints =3;
	    private char letter;
	    
	public ZeroCase(){
		
		System.out.println("You Created a zeroChance");

	}
	

	public int CalculScore() {
		// TODO Auto-generated method stub
		return 0;
	}


	public int getWinPoints() {
		return WinPoints;
	}


	public void setWinPoints(int winPoints) {
		WinPoints = winPoints;
	}


	public void SetLetter(char c) {
		// TODO Auto-generated method stub
		this.letter = c;
		
	}


	public boolean LostWord() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public char GetLetter() {
		// TODO Auto-generated method stub
		return letter;
	}

}
