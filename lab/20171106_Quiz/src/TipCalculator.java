/**
 * Created by ttmohd on 11/6/17.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TipCalculator extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // construct scene graph
        Parent root =
                FXMLLoader.load(getClass().getResource("TipCalculator.fxml"));

        Scene scene = new Scene(root); // attach scene graph to scene
        primaryStage.setTitle("Tip Calculator"); // displayed in window's title bar
        primaryStage.setScene(scene); // attach scene to stage
        primaryStage.show(); // display the stage
    }
}
