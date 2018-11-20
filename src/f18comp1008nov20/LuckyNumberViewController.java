package f18comp1008nov20;

import java.net.URL;
import java.security.SecureRandom;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
/**
 * FXML Controller class
 *
 * @author jwright
 */
public class LuckyNumberViewController implements Initializable {
    @FXML
    private TextField nameTextField;

    @FXML
    private Label messageLabel;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        messageLabel.setText("");
    }    
    
    @FXML
    public void buttonPushed()
    {
        SecureRandom rng = new SecureRandom();
        messageLabel.setText(nameTextField.getText()+" your lucky number is "+
                            (rng.nextInt(10)+1));
    }
    
}
