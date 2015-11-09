package view;

import javafx.application.Application;
import javafx.stage.Stage;
import model.Employee;
import org.controlsfx.control.Notifications;

public class TBApplication extends Application {

    private Employee employee;

    public TBApplication(Employee emp) {

        employee = emp;
    }

    public void start() throws Exception{

        start(employee.generateState());
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        employee.generateState().show();

        Notifications.create().title("Autenticato").text("Benvenuto " + employee.getName() + "!").show();
    }
}
