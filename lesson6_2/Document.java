package org.example.lesson6_2;

public abstract class Document {
    protected String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    abstract String getType();
}
