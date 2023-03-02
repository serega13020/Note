package com.sus.note.View;

import com.sus.note.Controller.ItemNoteController;
import com.sus.note.HelloApplication;
import com.sus.note.Model.Note;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ItemNotesView {
    private AnchorPane itemNote;
    ItemNoteController controller;

    public ItemNotesView(){
       create();
    }
    public ItemNotesView(Note note){
       create();
       controller.getHeader_label().setText(note.getHeader());
       controller.getHeader_label().setText(note.getText());
       controller.getCreateTime_label().setText(Calendar2String("dd.MM.YY HH:mm:ss", note.getCreateTime()));
    }

    public AnchorPane getItemNote(){
        return itemNote;
    }

    private void create(){
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ItemNote.fxml"));
        controller = new ItemNoteController();
        fxmlLoader.setController(controller);
        try {
            itemNote = fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String Calendar2String(String pattern, Calendar time){
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        return format.format(time.getTime());
    }
}
