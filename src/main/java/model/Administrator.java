package model;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Administrator extends Job {

    @Override
    public Stage generateInterface() {

        Stage stage = new Stage();

        GridPane pane = new GridPane();
        Label label = new Label("SONO UN AMMINISTRATORE");
        pane.add(label, 0, 0, 2, 1);

        stage.setScene(new Scene(pane, 100, 100));
        stage.sizeToScene();

        return stage;
    }
}
