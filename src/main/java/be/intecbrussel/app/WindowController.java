package be.intecbrussel.app;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class WindowController {
    @FXML
    private TextField amount;

    @FXML
    private TextField tipAmount;

    @FXML
    private TextField totalAmount;

    @FXML
    private Slider tipSlider;

    @FXML
    private Label percentage;

    @FXML
    private void calculateTip(){

    }

    @FXML
    public void initialize(){
        tipSlider.valueProperty().addListener((observableValue, oldValue, newValue) -> {
            percentage.setText(String.format("%.2f%s", newValue, "%"));
        });
    }
}
