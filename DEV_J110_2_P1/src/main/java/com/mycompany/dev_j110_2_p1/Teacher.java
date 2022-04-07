/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dev_j110_2_p1;

/**
 *
 * @author USER
 */
public class Teacher extends Person {
    private String nameSpecialty; // Название специальности
    private Degree degree; // Учёная степень

// Перечислимый тип Учёной степени
    protected enum Degree {
        CANDIDATE("кандидат наук"), DOCTOR("доктор наук"), PHD("PnD");

        private String degree;

        Degree(String degree) {
            this.degree = degree;
        }

        @Override
        public String toString() {
            return degree;
        }
    }

    //Конструктор
    public Teacher(String name, String surname, Gender gender, String department, Degree degree, String nameSpecialty) {
        super(name, surname, gender, department);
        this.degree=degree;
        setNameSpecialty(nameSpecialty);
    }
    // Getter и Setter специальности
    public String getNameSpecialty() {
        return nameSpecialty;
    }

    public void setNameSpecialty(String nameSpecialty) {
        if(nameSpecialty == null)
            throw new IllegalArgumentException("Пустое значение");
        this.nameSpecialty = nameSpecialty;
    }
    // Getter учёной степени
    public Degree getDegree() {
        return degree;
    }
    //Переопределённый метод print дополнительно печатающий для преподавателя
    @Override
    public void print() {
        super.print();
        System.out.println((getGender()==Gender.MALE ? Gender.MALE : Gender.FEMALE)+" has "+getDegree()+" degree in "+getNameSpecialty());
    }
}
