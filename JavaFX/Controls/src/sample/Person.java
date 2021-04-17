package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class Person {
    private final SimpleStringProperty firstName;
    private final SimpleStringProperty lastName;
    private final SimpleStringProperty email;
    private final Button button;

    Person(String fName, String lName, String email) {
        this.firstName = new SimpleStringProperty(fName);
        this.lastName = new SimpleStringProperty(lName);
        this.email = new SimpleStringProperty(email);
        this.button = new Button("Click");
        button.setOnAction( e -> {
                    System.out.println(getFirstName() + " " + getLastName() + " " + getEmail());
                    Alert a = new Alert(Alert.AlertType.INFORMATION);
                    a.setContentText(getFirstName() + " " + getLastName() + " " + getEmail());
                    a.showAndWait();
                }
        );
    }

    public String getFirstName() {
        return firstName.get();
    }
    public void setFirstName(String fName) {
        firstName.set(fName);
    }

    public String getLastName() {
        return lastName.get();
    }
    public void setLastName(String fName) {
        lastName.set(fName);
    }

    public String getEmail() {
        return email.get();
    }
    public void setEmail(String fName) {
        email.set(fName);
    }

    public String toString() {
        return firstName + ", " + lastName + ", " + email;
    }

    public Button getButton() {
        return button;
    }


}

