import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import java.util.ArrayList;
import javafx.geometry.Pos;

/**Program: Exercise14_03
 * File: Exercise14_03.java
 * Summary: Displays 3 randomly generated cards from
 * a deck of 52 cards. 
 * Author: Eric George
 * Date: December 21, 2018
 */

public class Exercise14_03 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
            //Create array list for card number
            ArrayList<Integer> list = new ArrayList<>();
            //Get card generated from total of 52 cards
            for (int i = 1; i <= 52; i++){
               list.add(i);
            }
            //Add shuffle utility
            java.util.Collections.shuffle(list);
            //Create HBox for displaying the cards
            HBox pane = new HBox(5);
            //Create pane that is centered with 3 images presented
            pane.setAlignment(Pos.CENTER);
            pane.getChildren().add(new ImageView("card/" + list.get(0) + ".png"));
            pane.getChildren().add(new ImageView("card/" + list.get(1) + ".png"));
            pane.getChildren().add(new ImageView("card/" + list.get(2) + ".png"));
            //Create new scene to put the pane in
            Scene scene = new Scene(pane);
            primaryStage.setTitle("Exercise 14-3");
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        //Launch application
        public static void main(String args){
            launch(args);
        
        }

}