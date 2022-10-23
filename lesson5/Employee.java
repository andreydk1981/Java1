package org.example.lesson5;

//        1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//        2. Конструктор класса должен заполнять эти поля при создании объекта.
//        3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.

import java.util.Random;

public class Employee {
    private String fullName;
    private String jobTitle;
    private String email;
    private String phoneNumber;
    private Float salary;
    private int age;

    private Employee(String fullName, String jobTitle, String email, String phoneNumber, Float salary, int age) {
        super();
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public Employee() {
        Random rnd = new Random();
        this.fullName = "Unknown";
        this.jobTitle = "Unknown";
        this.email = "Unknown";
        this.phoneNumber = "00-00-00";
        this.salary = rnd.nextFloat(30000, 100000);
        this.age = rnd.nextInt(25, 55);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void info() {
        System.out.println(
                "fullName='" + fullName + '\'' +
                        ", jobTitle='" + jobTitle + '\'' +
                        ", email='" + email + '\'' +
                        ", phoneNumber='" + phoneNumber + '\'' +
                        ", salary=" + salary +
                        ", age=" + age +
                        '}');
    }

    public boolean checkAge(int ageNeeded) {
        return this.age >= ageNeeded;
    }
}
