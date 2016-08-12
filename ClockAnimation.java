/** Listing 15.16 ClockAnimation.java
* Creates a clock to show the current time
* and also ticks
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.util.Duration;

public class ClockAnimation extends Application{
	@Override
	public void start(Stage primaryStage){
		ClockPane clock = new ClockPane();

		// Create a handler for animation
		EventHandler<ActionEvent> enventHandler = e -> {
			clock.setCurrentTime(); 
		};

		// Create animation for running clock
		Timeline animation = new Timeline(
			new KeyFrame(Duration.millis(1000), enventHandler));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();

		// Create a scene and place it in the stage
		Scene scene = new Scene(clock, 300, 100);
		primaryStage.setTitle("ClockAnimation");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}