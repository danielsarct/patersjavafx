
package projetometre;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import projetometre.model.Categoria;

public class FXMLListViewController implements Initializable {

    
    private ListView<Categoria>lvcategorias;
    
    private List<Categoria> categorias = new ArrayList<>();
    
    private ObservableList<Categoria> obsCategorias;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        carregarCategorias();
    }    
    
    public void carregarCategorias(){
        
        Categoria c1 = new Categoria(1,"Comidas");
        Categoria c2 = new Categoria(2,"Bebidas");
        
        categorias.add(c1);
        categorias.add(c2);
        
        obsCategorias = FXCollections.observableArrayList(categorias);
        
        lvcategorias.setItems(obsCategorias);
        
    }
    
}
