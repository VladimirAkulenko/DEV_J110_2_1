/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dev_j110_2_p1;

/**
 *
 * @author USER
 */
public class GraduateStudent extends Person {
    private String dissertation; // Тема диссертации

    //Конструктор
    public GraduateStudent(String name,String surname, Gender gender, String department, String dissertation) {
        super(name,surname,gender,department);
        setDissertation(dissertation);
    }
// Getter и Setter дисертации
    public String getDissertation() {
        return dissertation;
    }

    public void setDissertation(String dissertation) {
        if (dissertation !=null && !dissertation.trim().isEmpty())
        this.dissertation = dissertation;
        else
            throw new IllegalArgumentException("Пустое значение");
    }
    //Переопределённый метод print дополнительно печатающий для аспирантов
    @Override
    public void print() {
        super.print();
        System.out.println((getGender() == Gender.MALE ? Gender.HER : Gender.HIS) + " thesis title is "+"“"+getDissertation()+"“");
    }
}
