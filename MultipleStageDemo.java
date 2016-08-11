
package intro2javap;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MultipleStageDemo extends Application{
    @Override // Override the start method in the Application class
    public void start(Stage mainStage){
        // Create a scene and place a button in the scene
        Scene scene = new Scene(new Button("OK"),500 , 420);
        mainStage.setTitle("MyJavaFXMultiple");// Place the scene in the stage
        mainStage.setScene(scene); //Place the scene in the stage
        mainStage.show(); // Display the stage
        
        Stage stage = new Stage(); // Create a new stage
        stage.setTitle("Second Stage"); //Set the stage title
        // Set a scene with a button in the stage
        stage.setScene(new Scene(new Button("Second"), 320,200));
        stage.show(); // Display the stage
        
        //Create a third stage
        Stage thirdS = new Stage();
        thirdS.setTitle("The Third Stage"); // Sets the title for the third stage
        thirdS.setScene(new Scene(new Button("Third Stage"),100, 200)); // give the scene width and height
        thirdS.show(); // Displays the stage
        thirdS.setResizable(false);
        
    }
    public static void main(String[] args){
        Application.launch(args);
    }
}
