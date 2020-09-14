package be.intecbrussel.app;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class WindowController {
    @FXML
    private Label buttonLabel;

    private int counter = 0;

    @FXML
    public void clickMeButtonClicked(){
        if (!buttonLabel.isVisible()){
            buttonLabel.setVisible(true);
        }

        counter++;
        buttonLabel.setText("Amount of times the button is clicked: " + counter);
    }
}
