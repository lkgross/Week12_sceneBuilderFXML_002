package bsu.comp152;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField display;

    private int firstNumber;
    public void numberClicked(ActionEvent actionEvent) {
        var buttonPressed = (Button) actionEvent.getSource();
        var newNumber = buttonPressed.getText();
        var oldNumber = display.getText();
        var newDisplayNumber = oldNumber + newNumber;
        display.setText(newDisplayNumber);
    }

    public void clearPressed(ActionEvent actionEvent) {
        display.setText("");
    }

    public void plusPressed(ActionEvent actionEvent) {
        String numberAsString = display.getText();
        firstNumber = Integer.parseInt(numberAsString);
        display.setText("");
    }

    public void equalsPressed(ActionEvent actionEvent) {
        String numberAsString = display.getText();
        int secondNumber = Integer.parseInt(numberAsString);
        display.setText(String.valueOf(firstNumber + secondNumber));
    }
}
