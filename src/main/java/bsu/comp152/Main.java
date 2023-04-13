package bsu.comp152;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Code from Dr. Santore
 * Modified by Laura K. Gross, laura.gross@bridgew.edu, 3/2023
 */
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        // Store the location of the user interface (UI) resource.
        var loc = getClass().getResource("Main.fxml");
        // Parent is the superclass of Stage.
        // Call the load method, passing in the location loc.
        Parent root = FXMLLoader.load(loc);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("A GUI Designed in Scene Builder");
        primaryStage.show();
    }
}