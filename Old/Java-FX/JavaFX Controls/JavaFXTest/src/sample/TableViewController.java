package sample;

import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.Callback;

public class TableViewController {

    @FXML
    private TableView tableView;

    ObservableList<Person> data;

    @FXML
    private Button button;

    private boolean init = true;

    private void initializeColumns() {
        TableColumn<Person, String> firstNameCol = new TableColumn<>("First Name");
        firstNameCol.setMinWidth(100);
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        //firstNameCol.setCellFactory(TextFieldTableCell.<Person>forTableColumn());
        firstNameCol.setOnEditCommit(
                (TableColumn.CellEditEvent<Person, String> t) ->
                t.getTableView().getItems().get(t.getTablePosition().getRow()).setFirstName(t.getNewValue())
        );

        TableColumn<Person, String> lastNameCol = new TableColumn<>("Last Name");
        lastNameCol.setMinWidth(100);
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        //lastNameCol.setCellFactory(TextFieldTableCell.<Person>forTableColumn());
        /*lastNameCol.setOnEditCommit(
                (TableColumn.CellEditEvent<Person, String> t) ->
                        t.getTableView().getItems().get(t.getTablePosition().getRow()).setLastName(t.getNewValue())
        );*/

        TableColumn<Person, String> emailCol = new TableColumn<>("Email");
        emailCol.setMinWidth(200);
        emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));
        //emailCol.setCellFactory(TextFieldTableCell.<Person>forTableColumn());
        /*emailCol.setOnEditCommit(
                (TableColumn.CellEditEvent<Person, String> t) ->
                        t.getTableView().getItems().get(t.getTablePosition().getRow()).setEmail(t.getNewValue())
        );*/

        TableColumn<Person, String> buttonCol = new TableColumn<>("Click");
        buttonCol.setMinWidth(100);
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
        //data.get(0).setFirstName("Jacob2");


    }

    @FXML
    void buttonAction(ActionEvent event) {
        data.get(0).setFirstName("Jacob2");
        data.get(0).setLastName("Smith3");
        refreshTable();


    }

    public void refreshTable()
    {
        for (int i = 0; i < tableView.getColumns().size(); i++) {
            ((TableColumn)(tableView.getColumns().get(i))).setVisible(false);
            ((TableColumn)(tableView.getColumns().get(i))).setVisible(true);
        }
    }
}
