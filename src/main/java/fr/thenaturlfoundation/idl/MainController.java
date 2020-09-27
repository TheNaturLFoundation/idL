
package fr.thenaturlfoundation.idl;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class MainController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
    }
}
