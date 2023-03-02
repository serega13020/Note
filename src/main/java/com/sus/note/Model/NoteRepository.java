package com.sus.note.Model;

import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

public class NoteRepository {

    static public boolean needRereadUncompletedNotes = true;
    static public boolean needRereadCompletedNotes = true;
    static private List<Note> uncompletedNotes = new LinkedList<Note>();
    static private List<Note> completedNotes = new LinkedList<Note>();

    static public List<Note> getAllUncompletedNotes(){
        if(needRereadUncompletedNotes)
            rereadUncompletedNotes();
        return uncompletedNotes.stream().toList();
    }

    static public List<Note> getAllCompletedNotes(){
        if(needRereadCompletedNotes)
            rereadCompletedNotes();
        return completedNotes.stream().toList();
    }

    static public void rereadUncompletedNotes(){
        uncompletedNotes.clear();

        uncompletedNotes.add(new Note(1, "Header 1", "Text 1", new GregorianCalendar()));
        uncompletedNotes.add(new Note(2, "Header 2", "Text 2", new GregorianCalendar()));
        uncompletedNotes.add(new Note(3, "Header 3", "Text 3", new GregorianCalendar()));

        needRereadUncompletedNotes = false;
    }

    static public void rereadCompletedNotes(){
        completedNotes.clear();

        completedNotes.add(new Note(4, "Complete 4", "Text 4", new GregorianCalendar()));
        completedNotes.add(new Note(5, "Complete 5", "Text 5", new GregorianCalendar()));
        completedNotes.add(new Note(6, "Complete 6", "Text 5", new GregorianCalendar()));

        needRereadCompletedNotes = false;
    }

}
