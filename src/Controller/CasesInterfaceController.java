package Controller;

import java.util.Random;

import Model.Case;
import Model.CaseFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;

public class CasesInterfaceController {
    
	   @FXML
	    private AnchorPane Input;

	    @FXML
	    private Button generate;

        @FXML
        private TextField WordGenerate;
        
        @FXML
        private FlowPane CasesHolder;
    
    TextField field;
	CaseFactory factory;
	Case cas;
	String word;
	String id;
	
	    @FXML
	    void Generate(ActionEvent event) {  	
	    word = WordGenerate.getText(); 	
	    factory = CaseFactory.instance();
	    CasesHolder.getChildren().clear();
	    GenerateCases(word);
	    }
	    
	    private void GenerateCases(String word){
	    	Random ran = new Random();
	    	for (Character c : word.toCharArray()){
	    		int x = ran.nextInt(3) + 1;
	    		switch(x){
	    		case 1: cas = factory.getCase(c,"MultiCase");
	    		id="MultiChance";
	    		break;
	    		case 2: cas = factory.getCase(c,"ProposCase");
	    		id="Propos";
	    		break;
	    		case 3: cas = factory.getCase(c,"ZeroCase");
	    		id="ZeroChance";
	    		break;
	    		}
	    		field= new TextField();
	    		field.setId(id);
	    		field.setMaxSize(30,30);
	    		field.setText(c.toString());
	    		CasesHolder.getChildren().add(field);

	         }
	    }
	
}
