package com.sus.note.Model;

import java.util.Calendar;

public class Note {

    private int id;
    private String header;
    private String text;
    private Calendar createTime;

    public Note(int id, String header, String text, Calendar createTime) {
        this.id = id;
        this.header = header;
        this.text = text;
        this.createTime = createTime;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Calendar getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Calendar createTime) {
        this.createTime = createTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
