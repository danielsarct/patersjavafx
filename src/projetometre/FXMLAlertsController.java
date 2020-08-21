
package projetometre;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;


public class FXMLAlertsController implements Initializable {


    @FXML
    private Button btnAbrirAlert;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    public void abriAlert(){
        
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("TITULO");
        alert.setHeaderText("cabecalho");
        alert.setContentText("conteudo");
        alert.show();
    }
    
    
    
    
}
