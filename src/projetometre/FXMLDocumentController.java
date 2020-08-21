
package projetometre;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    
    @FXML
    private TextField txtnome;
    
    @FXML
    private void acaoDoBotao(ActionEvent event) {
        System.out.println("voce clicou!");
        label.setText("Ola mundo: "+txtnome.getText());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
