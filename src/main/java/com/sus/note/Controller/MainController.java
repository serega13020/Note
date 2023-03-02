package com.sus.note.Controller;

import com.sus.note.HelloApplication;
import com.sus.note.View.CenterPartItemNotesListView;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private VBox VBox_NewItemNotesList;
    @FXML
    private SplitPane Split;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Split.getItems().add(CenterPartItemNotesListView.getView());
    }

    public MainController(){

    }
}
