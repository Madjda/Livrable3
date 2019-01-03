package Model;

import java.util.ArrayList;

public class CaseFactory {

		private ArrayList<Case> casesArray = new ArrayList<Case>();
		
		private CaseFactory() {}
		
		private static class SingletonHolder {
			 
			private final static CaseFactory  Instance = new CaseFactory ();
			 
			 }
		public static CaseFactory instance() {
			 
			return SingletonHolder.Instance;
			
			 }

		public Case getCase(char character, String type){
			    
			    /**
			     * Si l'instance exist déja, retourner l'instance selon le type indiqué
			     * 			     
			     * */
				for (Case cas : casesArray) {
					if(cas.getClass().getSimpleName().equals(type)){
						cas.SetLetter(character);
						System.out.println("I returned an instance of "+ type+" with a char =="+cas.GetLetter());
						return cas;
					}
			    }
				
				/**
				 * Sinon crée une instance et sauvegarde cette derniere dans la liste des cases i.e. List des flyweights
				 * 
				 * */
				Case cas = null ;

				if (type =="MultiCase") { cas = new MultiCase();
				                          casesArray.add(cas);}
				if (type =="ZeroCase") { cas = new ZeroCase();
                                           casesArray.add(cas);}
				if (type =="ProposCase") { cas = new ProposCase();
                                            casesArray.add(cas);}
				cas.SetLetter(character);
				return cas;
	        
		}
	}
