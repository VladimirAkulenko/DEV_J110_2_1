/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dev_j110_2_p1;

/**
 *
 * @author USER
 */
public class Person {
    private String name; // Имя
    private String surname; // Фамилия
    private String department; //Название факультета
    private Gender gender; // Пол

// Перечислимый тип Пол
    protected enum Gender {
        MALE("He"), FEMALE("She"), HIS("His"), HER("Her");

        private String gender;

        Gender(String gender) {
            this.gender = gender;
        }

        @Override
        public String toString() {
            return gender;
        }
    }

    //Конструктор
    public Person(String name, String surname, Gender gender, String department) {
        setName(name);
        setSurname(surname);
        this.gender = gender;
        setDepartment(department);
    }

    // Getter и Setter имени
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.trim().isEmpty())
        this.name = name;
        else
            throw new IllegalArgumentException("Пустое значение");
    }

    // Getter и Setter фамилии
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname!=null && !surname.trim().isEmpty())
        this.surname = surname;
        else
            throw new IllegalArgumentException("Пустое значение");
    }

    // Getter и Setter названия факультета
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department!=null && !department.trim().isEmpty())
        this.department = department;
        else
            throw new IllegalArgumentException("Пустое значение");
    }

    // Getter пола
    public Gender getGender() {
        return gender;
    }
//Реализация метода print, печатает информацию о персоне
    public void print (){
        System.out.println("This is " +getName()+ " " + getSurname()+". "+
                (getGender()==Gender.MALE ? Gender.MALE : Gender.FEMALE)+
                ( this instanceof Teacher ? " teaches" : " studies")+" at "
                +getDepartment()+".");
    }
//Реализация метода printAll, печатает данные о персонах из заданного массива
    public static void printAll (Person[] person) {
        for (Person pers: person)
            pers.print();
    }
}
