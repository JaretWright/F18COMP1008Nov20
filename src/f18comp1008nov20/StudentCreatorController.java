/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f18comp1008nov20;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author jwright
 */
public class StudentCreatorController implements Initializable {

    @FXML
    private ComboBox<String> genderComboBox;
    
    @FXML 
    private ImageView imageView;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //configure the combobox
        genderComboBox.setPromptText("Select gender");
        genderComboBox.getItems().add("male");
        genderComboBox.getItems().add("female");
        genderComboBox.getItems().add("other");
        
    }    
    
    @FXML
    public void genderChanger()
    {
        String gender = genderComboBox.getValue();
        if (gender.equalsIgnoreCase("male"))
            imageView.setImage(new Image("./images/male.png"));
        else if (gender.equalsIgnoreCase("female"))
            imageView.setImage(new Image("./images/female.png"));
        else
            imageView.setImage(new Image("./images/other.png"));
    }
    
}
