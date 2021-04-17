package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ListViewController {

    @FXML
    private ListView<String> listView;

    @FXML
    private Button button;


    @FXML
    void buttonAction(ActionEvent event) {
        ObservableList names = FXCollections.observableArrayList();
        names.addAll(
                "Adam", "Alex", "Alfred", "Albert",
                "Brenda", "Connie", "Derek", "Donny",
                "Lynne", "Myrtle", "Rose", "Rudolph",
                "Tony", "Trudy", "Williams", "Zach"
        );

        listView.setItems(names);

        listView.getSelectionModel().selectedItemProperty().addListener(
                (observableValue, oldValue, newValue) -> {
                    Alert a = new Alert(Alert.AlertType.CONFIRMATION);
                    a.setContentText(newValue);
                    a.showAndWait();
                }
        );
    }
}
