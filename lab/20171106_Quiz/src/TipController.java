/**
 * Created by ttmohd on 11/6/17.
 */
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import java.math.BigDecimal;
import javafx.event.ActionEvent;


public class TipController {

    @FXML
    private Slider tipPercentageSlider;

    @FXML
    private Label tipPercentageLabel;

    @FXML
    private TextField tipTextField;

    @FXML
    private TextField amountTextField;

    @FXML
    private TextField totalTextField;

    @FXML
    private void calculator(ActionEvent event)  {
        try {
            BigDecimal amount = new BigDecimal(amountTextField.getText());
            BigDecimal tip = amount.multiply(tipPercentage);
            BigDecimal total = amount.add(tip);

            tipTextField.setText(currency.format(tip));
            totalTextField.setText(currency.format(total));
        } catch (NumberFormatException ex) {
            amountTextField.setText("Enter amount");
            amountTextField.selectAll();
            amountTextField.requestFocus();
        }
    }

}

