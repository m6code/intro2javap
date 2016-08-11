import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFxNoMainMethod extends Application {
    @Override //Override the start method in the aApplicaton class
    public void start(Stage primaryStage){
        //Create a scene and place a button in the scene
        Button btOK = new Button("OK");
        Scene scene = new Scene(btOK, 1200, 720);
        primaryStage.setTitle("MyJavaFX");//Set the stage title
        primaryStage.setScene(scene);//Place the scene in the stage
        primaryStage.show();//display the stage
    }
    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. not needed for running from the line.
     */
    //public static void main(String[] args){
    //    Application.launch(args);
    //}
}
