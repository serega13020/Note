package com.sus.note.View;

import com.sus.note.Controller.CenterPartItemNotesListController;
import com.sus.note.Controller.ItemNoteController;
import com.sus.note.HelloApplication;
import com.sus.note.Model.Note;
import com.sus.note.Model.NoteRepository;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.List;

public class CenterPartItemNotesListView {
    static private AnchorPane anchorPane = null;
    static private CenterPartItemNotesListController controller;
    private CenterPartItemNotesListView(){}

    static private void create(){
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CenterPart_ItemListNotes.fxml"));
        controller = new CenterPartItemNotesListController();
        fxmlLoader.setController(controller);
        try {
            anchorPane = fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        fillUncompletedNotes(controller.getUncompletedNotesList_VBox());

    }

   static private void fillUncompletedNotes(VBox v){
        v.getChildren().clear();
        List<Note> notes = NoteRepository.getAllUncompletedNotes();
        for(Note note : notes){
            ItemNotesView itemNotesView = new ItemNotesView(note);
           v.getChildren().add(itemNotesView.getItemNote());
        }
    }
    static public AnchorPane getView(){
        if(anchorPane == null)
            create();
        return anchorPane;
    }

}
