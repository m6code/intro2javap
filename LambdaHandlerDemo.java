import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LambdaHandlerDemo extends Application{
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage){
		// Hold two buttons in an HBOx
		HBox hBox = new HBox();
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		Button btNew = new Button("New");
		Button btOpen = new Button("Open");
		Button btSave = new Button("Save");
		Button btPrint = new Button("Print");
		Button btExit = new Button("Exit");
		hBox.getChildren().addAll(btNew, btOpen, btSave, btPrint, btExit);

		// Create and register the handler
		btNew.setOnAction((ActionEvent e) -> {
			System.out.println("Process New");
		});

		btOpen.setOnAction((e) -> {
			System.out.println("Process Open");
		});

		btSave.setOnAction((e) -> {
			System.out.println("Process Save");
		});

		btPrint.setOnAction((e) -> {
			System.out.println("Process Print");
		});

		/*OR this 
		* btPrint.SetOnAction(e -> System.out.println("Process Print"));
		*/

		btExit.setOnAction((e) -> {
			System.out.println("Process Exit");
			System.exit(1);
		});

		// Create the scene and place it on the stage
		Scene scene = new Scene(hBox, 350, 70);
		primaryStage.setTitle("LambdaHandlerDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}