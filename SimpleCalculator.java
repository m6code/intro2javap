import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.geometry.HPos;

public class SimpleCalculator extends Application{
    private TextField tfResults = new TextField();
    private TextField tfNumberOne = new TextField();
    private TextField tfNumberTwo = new TextField();
    private TextField tfOperator = new TextField();
    private Button btPlus = new Button("+");
    private Button btMinus = new Button("-");
    private Button btTimes = new Button("x");
    private Button btDivide = new Button("/");
    
    @Override // Override the start method in the application class
    public void start(Stage primaryStage){
        // Create the UI
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        // The TextField and their Labels
        gridPane.add(new Label("Number 1"),0,0);
        gridPane.add(tfNumberOne,1,0);
        gridPane.add(new Label("Operator"),0,1);
        gridPane.add(tfOperator,1,1);
        gridPane.add(new Label("Number 2"),0,2);
        gridPane.add(tfNumberTwo,1,2);
        gridPane.add(new Label("Result:"),0,3);
        gridPane.add(tfResults,1,3);
        
        // The Buttons
        gridPane.add(btPlus,1,4);
        gridPane.add(btMinus,2,4);
        gridPane.add(btTimes,3,4);
        gridPane.add(btDivide,4,4);
        
        // Set Properties for UI
        gridPane.setAlignment(Pos.CENTER);
        tfResults.setAlignment(Pos.BOTTOM_RIGHT);
        tfNumberOne.setAlignment(Pos.BOTTOM_RIGHT);
        tfNumberTwo.setAlignment(Pos.BOTTOM_RIGHT);
        tfOperator.setAlignment(Pos.BOTTOM_RIGHT);
        tfResults.setEditable(false);
        tfOperator.setEditable(false);
        //GridPane.setHalignment(btPlus, HPos.LEFT);
        //GridPane.setHalignment(btMinus, HPos.LEFT);
        //GridPane.setHalignment(btTimes, HPos.LEFT);
        
        // Process events
        btPlus.setOnAction(e -> calculatePlus());
        btMinus.setOnAction(e -> calculateMinus());
        btTimes.setOnAction(e -> calculateTimes());
        btDivide.setOnAction(e -> calculateDivide());
        
        // Create scene and place it in the stage
        Scene scene = new Scene(gridPane, 500, 350);
        primaryStage.setTitle("Simple Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
        
    public int calculatePlus(){
       int numberOne = Integer.parseInt(tfNumberOne.getText());
       int numberTwo = Integer.parseInt(tfNumberTwo.getText());
       int pResult = numberOne + numberTwo;
       tfOperator.setText(String.format("%s","+"));
       tfResults.setText(String.format("%d", pResult));
       return pResult;
    }
    
    public int calculateMinus(){
       int numberOne = Integer.parseInt(tfNumberOne.getText());
       int numberTwo = Integer.parseInt(tfNumberTwo.getText());
       int pResult = numberOne - numberTwo;
       tfOperator.setText(String.format("%s","-"));
       tfResults.setText(String.format("%d", pResult));
       return pResult;
    }
        
    public int calculateTimes(){
       int numberOne = Integer.parseInt(tfNumberOne.getText());
       int numberTwo = Integer.parseInt(tfNumberTwo.getText());
       int pResult = numberOne * numberTwo;
       tfOperator.setText(String.format("%s","x"));
       tfResults.setText(String.format("%d", pResult));
       return pResult;
    }
    
    public double calculateDivide(){
        double numberOne = Double.parseDouble(tfNumberOne.getText());
        double numberTwo = Double.parseDouble(tfNumberTwo.getText());
        double pResult = numberOne / numberTwo;
        tfOperator.setText(String.format("%s", "/"));
        tfResults.setText(String.format("%.6f",pResult));
        return pResult;
    }
    
    // OverLoading the Above
    
   /** public double calculatePlus(){
       double numberOne = Double.parseDouble(tfNumberOne.getText());
       double numberTwo = Double.parseDouble(tfNumberTwo.getText());
       double pResult = numberOne + numberTwo;
       tfOperator.setText(String.format("%s","+"));
       tfResults.setText(String.format("%.4f", pResult));
       return pResult;
    }
    
    public void double calculateMinus(){
       double numberOne = Double.parseDouble(tfNumberOne.getText());
       double numberTwo = Double.parseDouble(tfNumberTwo.getText());
       double pResult = numberOne - numberTwo;
       tfOperator.setText(String.format("%s","-"));
       tfResults.setText(String.format("%.4f", pResult));
       return pResult;
    }
        
    public double calculateTimes(){
       double numberOne = Double.parseDouble(tfNumberOne.getText());
       double numberTwo = Double.parseDouble(tfNumberTwo.getText());
       double pResult = numberOne * numberTwo;
       tfOperator.setText(String.format("%s","x"));
       tfResults.setText(String.format("%d", pResult));
       return pResult;
    */
  
}