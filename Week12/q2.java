import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.canvas.*;
import javafx.scene.control.*;

public class q2 extends Application {
    public static void main(String args[]) {
        launch(args);
    }

    public void start(Stage mystage) {
        FlowPane rootNode = new FlowPane();
        Scene myscene = new Scene(rootNode, 600, 200);
        mystage.setTitle("JavaFx Resume");

        Label lb1 = new Label("Enter Name:- ");
        TextField tf1 = new TextField();
        Label lb2 = new Label("Languages Spoken:");

        CheckBox cb1 = new CheckBox("Telugu");
        CheckBox cb2 = new CheckBox("English");
        CheckBox cb3 = new CheckBox("Hindi");

        Canvas cv1 = new Canvas(600, 100);
        GraphicsContext gc1 = cv1.getGraphicsContext2D();

        Button bt1 = new Button("Generate Resume");

        bt1.setOnAction(event -> {
            gc1.clearRect(0, 0, cv1.getWidth(), cv1.getHeight());
            String name = tf1.getText();
            String Languages = "";
            Languages += (cb1.isSelected()) ? "Telugu " : "";
            Languages += (cb2.isSelected()) ? "English " : "";
            Languages += (cb3.isSelected()) ? "Hindi " : "";
            gc1.fillText(name, 250, 50);
            gc1.fillText("Languages Spoken: " + Languages, 250, 70);
        });

        rootNode.getChildren().addAll(lb1, tf1, cb1, cb2, cb3, bt1, cv1);
        mystage.setScene(myscene);
        mystage.show();
    }
}
