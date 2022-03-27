/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dev_j110_2_p1;

/**
 *
 * @author USER
 */
public class Student extends Person {
    private Stage study; // Ступень обучения
    private int courseNumber; // Номер курса

// Перечислимый тип Ступени обучения
   protected enum Stage {
        BACHELOR("Бакалавор"), MASTER("Магистр");

        private String study;

        Stage(String study){
            this.study = study;
        }

       @Override
       public String toString() {
           return study;
       }
   }

    //Конструктор
    public Student(String name, String surname, Gender gender, String department, Stage study, int courseNumber) {
        super(name, surname,gender, department);
        this.study = study;
        setCourseNumber(courseNumber);
    }
    // Getter и Setter номера курса
    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
       if(courseNumber<=0)
           throw new IllegalArgumentException("Курс не может быть меньше нуля или равным нулю");
        this.courseNumber = courseNumber;
    }
    // Getter ступени обучения
    public Stage getStudy() {
        return study;
    }
    //Переопределённый метод print дополнительно печатающий для студента
    @Override
    public void print() {
        super.print();
        System.out.println((getGender()==Gender.MALE ? Gender.MALE : Gender.FEMALE)+" is "+getCourseNumber()+"‘th year "+ getStudy()+" student.");
    }
}
