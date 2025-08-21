/*
JavaFX application to display a magenta welcome message with FlowPane layout
*/
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;

public class q1 extends Application {
    public static void main(String args[]) {
        launch(args);
    }

    public void start(Stage mystage) {
        FlowPane flowpane = new FlowPane(20, 20);
        Scene myscene = new Scene(flowpane, 500, 200);
        mystage.setTitle("This is the first JavaFX Application");
        Label lb1 = new Label("Welcome to JavaFX programming");
        lb1.setTextFill(Color.MAGENTA);
        flowpane.getChildren().add(lb1);
        mystage.setScene(myscene);
        mystage.show();
    }
}
