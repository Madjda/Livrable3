package Model;
	
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	@FXML
	 static  AnchorPane Layout;
	static Stage primaryStage ;
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader ();
			loader.setLocation(Main.class.getResource("../View/FactoryInterface.fxml"));
	        Layout = loader.load();
			Scene scene = new Scene(Layout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		CaseFactory factory = CaseFactory.instance();
		factory.getCase('c', "MultiCase");
		factory.getCase('b', "MultiCase");
		factory.getCase('a', "ZeroCase");
		factory.getCase('a', "ZeroCase");
		factory.getCase('a', "ProposCase");
		factory.getCase('a', "MultiCase");

	}
}
