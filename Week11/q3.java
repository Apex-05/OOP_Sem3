/*
JavaFX program with TextField for username and PasswordField, SignIn button, display welcome message
*/
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;

public class q3 extends Application {
    public static void main(String args[]) {
        launch(args);
    }

    public void start(Stage mystage) {
        mystage.setTitle("JavaFx");
        Label lb1 = new Label("Welcome");
        Label lb2 = new Label("Username");
        Label lb3 = new Label("Password");
        TextField tf1 = new TextField();
        PasswordField tf2 = new PasswordField();
        Button bt1 = new Button("SignIn");

        GridPane gp1 = new GridPane();
        gp1.setAlignment(Pos.CENTER);
        gp1.setMinSize(300, 200);
        gp1.setVgap(5);
        gp1.setHgap(5);

        gp1.add(lb1, 1, 0);
        gp1.add(lb2, 0, 1);
        gp1.add(tf1, 1, 1);
        gp1.add(lb3, 0, 2);
        gp1.add(tf2, 1, 2);
        gp1.add(bt1, 1, 3);

        bt1.setOnAction((event) -> {
            Label lb4 = new Label("Welcome " + tf1.getText());
            gp1.add(lb4, 0, 4);
        });

        Scene myscene = new Scene(gp1);
        mystage.setScene(myscene);
        mystage.show();
    }
}
