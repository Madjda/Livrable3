package Controller;

import Model.Joueur;
import Model.JoueurFactory;
import Model.JoueurStdFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class FactoryInterfaceController {

    @FXML
    private AnchorPane InputPseudo;

    @FXML
    private Button jouuer;

    @FXML
    private TextField pseudo;
    @FXML
    private Label result;
    
    JoueurFactory  factory ;
    Joueur joueur;
    
    String pseudoJoueur;
    @FXML
    void jouer(ActionEvent event) {  	
    pseudoJoueur = pseudo.getText(); 	
    factory = new JoueurStdFactory () ;
    joueur = factory.createJoueur();
    joueur.setPseudo(pseudoJoueur);
    result.setText("Joueur crée avec succés");
    
    }

}
