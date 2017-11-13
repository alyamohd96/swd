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





}
