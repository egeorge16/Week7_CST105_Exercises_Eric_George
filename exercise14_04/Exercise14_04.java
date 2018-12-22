package exercise14_04;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**Program: Exercise14_04
 * File: Exercise14_04.java
 * Summary: Displays Java 4 times vertically
 * in different colors and opacity.
 * Author: Eric George
 * Date: December 21, 2018
 */

public class Exercise14_04 extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {    
    //Add new HBox to hold the words   
    HBox pane = new HBox();
    pane.setAlignment(Pos.CENTER);
    //Set teh font style and size
    Font font = Font.font("Times New Roman", FontWeight.BOLD, 
        FontPosture.ITALIC, 22);
//Create loop for displaying Java in random colors and opacity
    for (int i = 0; i < 5; i++) {
      Text txt = new Text("Java");
      txt.setRotate(90);
      txt.setFont(font);
      txt.setFill(new Color(Math.random(), Math.random(), Math.random(), Math.random()));
      pane.getChildren().add(txt);
    }
        
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 200, 200);
    primaryStage.setTitle("Exercise14_04"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }

  public static void main(String[] args) {
    launch(args);
  }
} 
