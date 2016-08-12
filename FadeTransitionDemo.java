import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FadeTransitionDemo extends Application {
	@Override
	public void start(Stage primaryStage){
		// Place an ellipse to the pane
		Pane pane = new Pane();
		Ellipse ellipse = new Ellipse(10, 10, 100, 50);
		ellipse.setFill(Color.RED);
		ellipse.setStroke(Color.BLACK);
		ellipse.centerXProperty().bind(pane.widthProperty().divide(2));
		ellipse.centerYProperty().bind(pane.heightProperty().divide(2));
		ellipse.radiusXProperty().bind(
			pane.widthProperty().multiply(0.4));
		ellipse.radiusYProperty().bind(
			pane.heightProperty().multiply(0.4));

		// Apply a fade transition to ellipse
		FadeTransition ft = new FadeTransition(Duration.millis(3000), ellipse);
		ft.setFromValue(1.0);
		ft.setToValue(0.1);
		ft.setCycleCount(Timeline.INDEFINITE);
		ft.setAutoReverse(False);
		ft.play(); // Starts animation

		// Control animation
		ellipse.setOnMousePressed(e -> ft.pause());
		ellipse.setOnMousePressed(e -> ft.play());

		
	}
}