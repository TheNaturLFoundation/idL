/*
 * Copyright (C) The NaturL Foundation - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by simon, 11/1/2021
 */

package gui;/*
 * Copyright (C) The NaturL Foundation - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by simon, 11/1/2021
 */

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
