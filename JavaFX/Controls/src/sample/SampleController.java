package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class SampleController {

    @FXML
    private DatePicker datePicker;

    @FXML
    private ProgressIndicator progressIndicator;

    @FXML
    private ProgressBar progressBar;

    @FXML
    private ColorPicker colorPicker;

    @FXML
    private Button button;


    @FXML
    void buttonAction(ActionEvent event) {
        System.out.println(colorPicker.getValue());
        System.out.println(datePicker.getValue());
        progressBar.setProgress(0.5);
        progressIndicator.setProgress(0.7);
    }
}
