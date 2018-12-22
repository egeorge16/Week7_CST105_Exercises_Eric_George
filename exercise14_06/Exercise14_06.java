package exercise14_06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

/**Program: Exercise14_06
 * File: Exercise14_06.java
 * Summary: Displays a checkerboard of white and black squares
 * Author: Eric George
 * Date: December 21, 2018
 */

public class Exercise14_06 extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {    
    //Set a width and height constant
    double WIDTH = 200;
    double HEIGHT = 200;
    //Create new pane
    Pane pane = new Pane();
    //Create loop for creating white color   
    for (int i = 0; i < 8; i++) { 
      boolean isWhite = i % 2 == 0;
      //Create loop for setting the squares as rectangles and have them as either white or black
      for (int j = 0; j < 8; j++) {
        Rectangle rectangle = new Rectangle(i * WIDTH / 8, 
          j * HEIGHT / 8, WIDTH / 8, HEIGHT / 8);
        
        rectangle.setStroke(Color.BLACK);
        
        if (isWhite) {
          rectangle.setFill(Color.WHITE);
        }
        else {
          rectangle.setFill(Color.BLACK);          
        }
        
        isWhite = !isWhite;
        //Add rectangle object to pane
        pane.getChildren().add(rectangle);
      }
    }

        
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, WIDTH, HEIGHT);
    primaryStage.setTitle("Exercise14_06"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  public static void main(String[] args) {
    launch(args);
  }
} 
