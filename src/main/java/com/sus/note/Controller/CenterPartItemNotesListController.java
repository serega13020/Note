package com.sus.note.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class CenterPartItemNotesListController implements Initializable {


    @FXML
    private VBox completedNotesList_VBox;

    @FXML
    private VBox uncompletedNotesList_VBox;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public VBox getCompletedNotesList_VBox() {
        return completedNotesList_VBox;
    }

    public VBox getUncompletedNotesList_VBox() {
        return uncompletedNotesList_VBox;
    }
}
