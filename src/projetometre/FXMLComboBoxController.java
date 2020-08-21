
package projetometre;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import projetometre.model.Categoria;


public class FXMLComboBoxController implements Initializable {

    
    @FXML
    private ComboBox<Categoria> cbcategorias;
    
    private List<Categoria>categorias = new ArrayList<>();
    private ObservableList<Categoria> obsCategorias;
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        carregarCategorias();
    }    
    
    public void carregarCategorias(){
        
        Categoria categoria1 = new Categoria(1,"Bebidas");
        Categoria categoria2 = new Categoria(2,"Comida");
       
        
        categorias.add(categoria2);
        categorias.add(categoria1);
        
        obsCategorias = FXCollections.observableArrayList(categorias);
        cbcategorias.setItems(obsCategorias);
        
    }
}
