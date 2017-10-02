package Interfaz;



import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	
	@Override
	public void start(Stage stage) throws Exception{
		Parent root =FXMLLoader.load(getClass().getResource("Interface.fxml"));
		stage.setTitle("PluginDVA");
		stage.setScene(new Scene(root,1400,700) );
		stage.show();
		stage.centerOnScreen();
		stage.setOnCloseRequest(e -> Platform.exit());
	}
	
	public static void main(String[] args) {		
		launch(args);
	}
}
