import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

public class NodeStyleRotateDemo extends Application{
	@Override //Override the start method in the Application class
	public void start (Stage primaryStage){
		//Create a scene and place a button in the scene
		StackPane pane = new StackPane();
		Button btOk = new Button("OKAY");
		btOk.setStyle("-fx-border-color: blue;");
		pane.getChildren().add(btOk);

		pane.setRotate(45);
		pane.setStyle("-fx-border-color: red; -fx-bacground-color: lightgray;");

		Scene scene = new Scene(pane, 250, 200);
		primaryStage.setTitle("NodeStyleRotateDemo"); //sets the title of the stage
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}
}