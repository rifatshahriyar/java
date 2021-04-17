package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class TableViewController {

    @FXML
    private TableView tableView;

    ObservableList<Person> data;

    @FXML
    private Button button;

    private boolean init = true;

    private void initializeColumns() {
        TableColumn<Person, String> firstNameCol = new TableColumn<>("First Name");
        firstNameCol.setMinWidth(80);
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));

        TableColumn<Person, String> lastNameCol = new TableColumn<>("Last Name");
        lastNameCol.setMinWidth(80);
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));

        TableColumn<Person, String> emailCol = new TableColumn<>("Email");
        emailCol.setMinWidth(200);
        emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));

        TableColumn<Person, String> buttonCol = new TableColumn<>("View");
        buttonCol.setMinWidth(80);
        buttonCol.setCellValueFactory(new PropertyValueFactory<>("button"));

        tableView.getColumns().addAll(firstNameCol, lastNameCol, emailCol, buttonCol);
    }

    public void load() {
        if (init) {
            initializeColumns();
            init = false;
        }

        data = FXCollections.observableArrayList(
                new Person("Jacob", "Smith", "jacob.smith@example.com"),
                new Person("Isabella", "Johnson", "isabella.johnson@example.com"),
                new Person("Ethan", "Williams", "ethan.williams@example.com"),
                new Person("Emma", "Jones", "emma.jones@example.com"),
                new Person("Michael", "Brown", "michael.brown@example.com")
        );

        tableView.setEditable(true);
        tableView.setItems(data);
    }

    @FXML
    void buttonAction(ActionEvent event) {
        data.get(0).setFirstName("JacobN ");
        data.get(0).setLastName("SmithN");
        tableView.refresh();
    }
}
