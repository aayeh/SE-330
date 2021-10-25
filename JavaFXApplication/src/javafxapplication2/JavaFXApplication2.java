/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;

/**
 *
 * @author aaronyeh
 */
public class JavaFXApplication2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("GridPane Experiment");
        
        GridPane gridPane = new GridPane();

        for(int i = 1; i < 32; i++){

            String s = String.valueOf(i);
            Button createButton = new Button(s);
            if(i <= 7){
               gridPane.add(createButton, i, 0, 1, 1);
               createButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
            }
            else if(i <= 14){
               int n = i - 7;
               gridPane.add(createButton, n, 1, 1, 1);
               createButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
               
                
            }
            else if(i <= 21){
               int n = i - 14;                
               gridPane.add(createButton, n, 2, 1, 1); 
               createButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
                
            }
            else if(i <= 28){
               int n = i - 21;                                
               gridPane.add(createButton, n, 3, 1, 1); 
               createButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
                
            }
            else{
               int n = i - 28;                                                
               gridPane.add(createButton, n, 4, 1, 1);    
               createButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
               
            }
        }
        gridPane.setHgap(100);
        gridPane.setVgap(100);
        primaryStage.setMaximized(true);
        Scene scene = new Scene(gridPane, 20000, 10000);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
