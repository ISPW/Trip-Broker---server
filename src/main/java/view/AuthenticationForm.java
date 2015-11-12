package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.Administrator;
import model.Designer;
import model.Employee;
import model.Scout;


public class AuthenticationForm extends Application {

    @Override
    public void start(final Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("/scene_login.fxml"));

        primaryStage.setTitle("Login");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root));
        primaryStage.sizeToScene();
        primaryStage.show();

        TextField user = (TextField) root.lookup("#txt_user");
        user.setPromptText("Insert your username");

        TextField password = (TextField) root.lookup("#txt_pass");
        password.setPromptText("Insert your password");

        Button confirm = (Button) root.lookup("#confirm_btn");

        confirm.addEventFilter(MouseEvent.MOUSE_CLICKED, event -> {

            String auth = user.getText();
            Employee emp;

            if ("gianni".equals(auth)) emp = new Employee(auth, new Administrator());
            else if ("roberto".equals(auth)) emp = new Employee(auth, new Scout());
            else emp = new Employee(auth, new Designer());

            primaryStage.close();

            try {
                new TBApplication(emp).start();
                AuthenticationForm.this.stop();
            }
            catch (Exception e) { e.printStackTrace(); }
        });
    }
}
