import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {

    private CalculatorModel model = new CalculatorModel();
    private boolean start = true;
    private String operator = "";
    private double number1;

    @FXML
    private TextField displayTextField;

    @FXML
    private void processNumber(ActionEvent event) {
        if (start) {
            displayTextField.setText("");
            start = false;
        }
        String value = ((Button) event.getSource()).getText();
        displayTextField.setText(displayTextField.getText() + value);
    }

    @FXML
    private void processClear(ActionEvent event) {
        displayTextField.setText("");
        this.number1 = 0;
        this.operator = "";
    }

    @FXML
    private void processOperator(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();

        if (!"=".equals(value)) {

            if (!operator.isEmpty())

                return;

            operator = value;
            number1 = Long.parseLong(displayTextField.getText());
            displayTextField.setText("");
        } else {

            if (operator.isEmpty())

                return;

            displayTextField.setText(String.valueOf(model.calculate(number1, Long.parseLong(displayTextField.getText()), operator)));
            operator = "";
            start = true;
        }
    }

}
