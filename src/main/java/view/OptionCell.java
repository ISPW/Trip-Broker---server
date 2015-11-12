package view;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class OptionCell extends ListCell<String> {

    @Override
    protected void updateItem(String item, boolean empty) {
        super.updateItem(item, empty);

        if (empty) {
            setGraphic(null);
        }
        else {

            Label lbl = new Label(item);
            Line line = new Line(25, 0, 155, 2);
            line.setStroke(Color.BLACK);
            VBox box = new VBox(line, lbl);
            box.setPrefHeight(32);
            box.setPadding(new Insets(0, 8, 0, 8));
            setGraphic(box);
        }
    }
}
