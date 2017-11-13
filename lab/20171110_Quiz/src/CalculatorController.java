import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {

    private CalculatorModel model = new CalculatorModel();
    private boolean start = true;

    @FXML
    private TextField displayTextField;

    @FXML
    private void processNumber(ActionEvent event) {
        if (start) {
            displayTextField.setText("");
            start = false;
        }
        String value = ((Button)event.getSource()).getText();
        displayTextField.setText(displayTextField.getText() + value);
    }

    @FXML
    private void processClear(ActionEvent event) {
        displayTextField.setText("");
        model.clear();
    }

    @FXML
    private void processOperator(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();

        if (!"=".equals(value)) {
            if (!operator.isEmpty())
                return;

            operator = value;
            model.setNumber1(Long.parseLong(output.getText()));
            output.setText("");
        }
        else {
            if (operator.isEmpty())
                return;

            model.setNumber2(Long.parseLong(output.getText()));
            result = model.calculate(operator);
            output.setText(String.valueOf(result));
            operator = "";
            start = true;
        }
    }



}
