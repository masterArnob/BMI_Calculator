package test.x6_bmi_calculator;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import static javafx.scene.control.Alert.AlertType.NONE;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable{

    @FXML
    private Button primaryButton;
  @FXML
    private Button Cal;
    @FXML
    private Label resultBMI;
    @FXML
    private Label resultCat;
    @FXML
    private Label Status;
    @FXML
    private TextField height;
    @FXML
    private TextField weight;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void doCal(ActionEvent event)
    {
        if(height.getText().trim().isEmpty() || weight.getText().trim().isEmpty())
        {
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setContentText("Please insert Height and Weight values");
            alert.show();
            Status.setText("Please values of Height and Weight ...");
        }
        else
        {
            double a = Double.parseDouble(height.getText());
            double b = Double.parseDouble(weight.getText());
            
            double ans = b/(a*a);
            
            resultBMI.setText("" +ans);
            
            if(ans<=18.5)
            {
                resultCat.setText("Under Weight");
            }
            else if(ans<=24.9)
            {
                resultCat.setText("Normal Weight");
            }
            else if(ans<=19.0)
            {
                resultCat.setText("Over Weight");
            }
            else
            {
                resultCat.setText("Obse");
            }
            
            Status.setText("Done ...");
            
        }
    }
}
