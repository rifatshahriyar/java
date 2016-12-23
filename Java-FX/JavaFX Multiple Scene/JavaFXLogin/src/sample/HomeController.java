package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HomeController {

    private Main main;

    @FXML
    private Label message;

    @FXML
    private ImageView image;

    @FXML
    private Button button;

    @FXML
    private Button fileButton;

    @FXML
    private Button barButton;

    public void init(String msg) {
        message.setText(msg);
        Image img = new Image(Main.class.getResourceAsStream("1.png"));
        image.setImage(img);
    }

    @FXML
    void logoutAction(ActionEvent event) {
        try {
            main.showLoginPage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void fileAction(ActionEvent event) {
        try {
            main.showFileChooser();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void barAction(ActionEvent event) {
        try {
            main.showBarChart();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void setMain(Main main) {
        this.main = main;
    }

}
