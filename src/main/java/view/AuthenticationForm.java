package view;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class AuthenticationForm extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane = new GridPane();
        TextField userField = new TextField();
        PasswordField passField = new PasswordField();
        Text userText = new Text();
        Text passText = new Text();
        Button loginButton = new Button();

        loginButton.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                System.out.println("Click di prova!");
            }
        });

        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(25);
        gridPane.setVgap(25);
        gridPane.setPadding(new Insets(25, 25, 25, 25));

        userField.setPromptText("Insert your username");
        passField.setPromptText("Insert your password");
        userText.setText("User:");
        passText.setText("Password:");
        loginButton.setText("Login");

        gridPane.add(userField, 2, 0, 2, 1);
        gridPane.add(userText, 0, 0, 2, 1);
        gridPane.add(passField, 2, 1, 2, 1);
        gridPane.add(passText, 0, 1, 2, 1);
        gridPane.add(loginButton, 2, 2, 2, 1);
        primaryStage.setTitle("Login");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(gridPane, 300, 275));
        primaryStage.show();
    }
}
