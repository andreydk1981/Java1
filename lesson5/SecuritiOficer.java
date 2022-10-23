package org.example.lesson5;

public class SecuritiOficer {
    private String name;

    public SecuritiOficer(String name) {
        this.name = name;
    }

    public boolean checkAdge (Employee groupMember, int minAdge){
        return groupMember.checkAge(minAdge);
    }
}
