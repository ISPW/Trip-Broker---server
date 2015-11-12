package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Designer extends Job {
    @Override
    public Stage generateInterface() {

        Stage stage = new Stage();

        BorderPane pane = null;
        try {

            pane = FXMLLoader.load(getClass().getResource("/scene_admin.fxml"));
            stage.setScene(new Scene(pane));
            stage.sizeToScene();
            stage.setTitle("TripBroker");

            ListView<String> list = new ListView<>();
            ObservableList<String> items = FXCollections.observableArrayList("Crea proposta", "I tuoi dati");
            list.setItems(items);
            list.setCellFactory(ComboBoxListCell.forListView(items));

            Pane tile = new Pane();
            tile.setStyle("-fx-background-color: #00BFA5");
            tile.setPrefWidth(Double.MAX_VALUE);
            tile.setMinHeight(100);
            tile.setPrefHeight(100);

            VBox nav = new VBox(tile, list);
            pane.setLeft(nav);
            nav.setMaxWidth(180);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return stage;
    }
}
