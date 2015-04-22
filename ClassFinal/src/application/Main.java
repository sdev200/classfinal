package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			// use grid pane
			GridPane root = new GridPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			
			// place simple label for testing
			root.setLayoutX(30);
			root.setLayoutY(30);
			root.setHgap(20);
			root.setVgap(20);
			Label lblPetName = new Label("Pet Name:");
			root.add(lblPetName, 0, 0);
			TextField txtPetName = new TextField();
			root.add(txtPetName, 1, 0);
			
			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
