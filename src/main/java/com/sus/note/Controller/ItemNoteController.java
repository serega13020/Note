package com.sus.note.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ItemNoteController implements Initializable {

    @FXML
    private Label createTime_label;

    @FXML
    private Label header_label;

    @FXML
    private Label text_label;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public Label getCreateTime_label() {
        return createTime_label;
    }

    public Label getHeader_label() {
        return header_label;
    }

    public Label getText_label() {
        return text_label;
    }
}
