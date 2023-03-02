package com.sus.note.View;

import com.sus.note.Controller.CenterPartItemNotesListController;
import com.sus.note.Controller.ItemNoteController;
import com.sus.note.HelloApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class CenterPartItemNotesListView {
    static private AnchorPane anchorPane = null;
    private CenterPartItemNotesListView(){}

    static private void create(){
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CenterPart_ItemListNotes.fxml"));
        CenterPartItemNotesListController controller = new CenterPartItemNotesListController();
        fxmlLoader.setController(controller);
        try {
            anchorPane = fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static public AnchorPane getView(){
        if(anchorPane == null)
            create();
        return anchorPane;
    }

}
