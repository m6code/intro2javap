import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PicRisingAnimation extends Application {
	@Override 
	public void start(Stage primaryStage){
		// Create a pane
		Pane pane = new Pane();

		// Add an image view and add it to pane
		ImageView imageView = new ImageView("image/us.jpg");
		pane.getChildren().add(imageView);

		//Create a path transition
		PathTransition pt = new PathTransition(Duration.millis(10000), 
			new Line(100, 200, 100, 0), imageView);
		pt.setCycleCount(5);
		pt.play(); // Start animation

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 800, 600);
		primaryStage.setTitle("PicRisingAnimation");
		primaryStage.setScene(scene);
		primaryStage.show(); // Displays the stage

	}
}