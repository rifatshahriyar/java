package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField userText;

    @FXML
    private Button submitButton;

    @FXML
    private Button resetButton;

    @FXML
    private PasswordField passwordText;

    @FXML
    void reset(ActionEvent event) {
        userText.setText("");
        passwordText.setText("");

    }

    @FXML
    void submit(ActionEvent event) {
        String username = userText.getText();
        String password = passwordText.getText();
        if (username.equals("admin") && password.equals("123")) {
            Alert a = new Alert(Alert.AlertType.CONFIRMATION);
            a.setHeaderText("Login Window");
            a.setContentText("Login successful");
            a.showAndWait();
        }
        else {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setHeaderText("Login Window");
            a.setContentText("Login unsuccessful");
            a.showAndWait();
        }
    }
}
