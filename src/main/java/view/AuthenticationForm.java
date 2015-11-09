package view;

import com.sun.javafx.application.PlatformImpl;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;
import model.Administrator;
import model.Designer;
import model.Employee;
import model.Scout;


public class AuthenticationForm extends Application {

    @Override
    public void start(final Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("/fxml_example.fxml"));

        primaryStage.setTitle("Login");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root));
        primaryStage.sizeToScene();
        primaryStage.show();

        TextField user = (TextField) root.lookup("#txt_user");
        user.setPromptText("Insert your username");

        TextField password = (TextField) root.lookup("#txt_pass");
        password.setPromptText("Insert your password");

        Button exit = (Button) root.lookup("#exit_btn");
        Button confirm = (Button) root.lookup("#confirm_btn");

        confirm.addEventFilter(MouseEvent.MOUSE_CLICKED, event -> {

            String auth = user.getText();
            Employee emp;

            if ("gianni".equals(auth)) emp = new Employee(new Administrator());
            else if ("roberto".equals(auth)) emp = new Employee(new Scout());
            else emp = new Employee(new Designer());

            primaryStage.close();

            try {
                new TBApplication().start(emp.generateState());
                AuthenticationForm.this.stop();
            }
            catch (Exception e) { e.printStackTrace(); }

        });

        exit.setOnAction(event -> primaryStage.fireEvent(new WindowEvent(primaryStage, WindowEvent.WINDOW_CLOSE_REQUEST)));
    }
}
