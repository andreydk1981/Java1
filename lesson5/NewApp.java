package org.example.lesson5;

public class NewApp {
    public static void main(String[] args) {
        Employee [] groupGOISS = new Employee [5];
        for (int i = 0; i < 5; i++) {
            groupGOISS[i] = new Employee();
            groupGOISS[i].setFullName("Full Name - "+i);
            groupGOISS[i].setJobTitle("Engineer - "+i);
            groupGOISS[i].setEmail("Email - "+i);
            groupGOISS[i].setPhoneNumber(""+i+i+"-"+i+i+"-"+i+i);
            groupGOISS[i].info();
        }
        System.out.println("-----------------");
        for (int i = 0; i < 5; i++) {
            if (groupGOISS[i].getAge() > 40){
                groupGOISS[i].info();
            }
        }


    }
}
