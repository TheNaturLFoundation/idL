
package fr.thenaturlfoundation.idl;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class MainController implements Initializable {
    @FXML
    TabPane tabPane;

    @FXML
    MenuItem openMenuButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Hi there!");
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        openMenuButton.setOnAction(event -> {
            tabPane.getTabs().get(0).setText("Hello World!");
            System.out.println("Hi there!");
        });
    }
}
