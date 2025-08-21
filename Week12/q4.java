import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class q4 extends Application {
    public static void main(String args[]) {
        launch(args);
    }

    public void start(Stage mystage) {
        FlowPane rootNode = new FlowPane();
        Scene myscene = new Scene(rootNode, 300, 300);
        mystage.setTitle("JavaFx Student");

        // Placeholder: logic to display student details on selection from ListView to be added here

        mystage.setScene(myscene);
        mystage.show();
    }
}
