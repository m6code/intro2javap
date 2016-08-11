import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ControlCircleWithoutEventHandling extends Application{
	@Override
	public void start(Stage primaryStage){
		StackPane pane = new StackPane();
		Circle circle = new Circle(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		pane.getChildren().add(circle);

		HBox hBoc = new HBox();
		hBoc.setSpacing(10);
		hBoc.setAlignment(Pos.CENTER);
		Button btEnlarge = new Button("Enlarge");
		Button btShrink = new Button("Shrink");
		hBoc.getChildren().add(btEnlarge);
		hBoc.getChildren().add(btShrink);

		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(pane);
		borderPane.setBottom(hBoc);
		BorderPane.setAlignment(hBoc, Pos.CENTER);

		Scene scene = new Scene(borderPane, 200, 150);
		primaryStage.setTitle("ControlCirlce");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}