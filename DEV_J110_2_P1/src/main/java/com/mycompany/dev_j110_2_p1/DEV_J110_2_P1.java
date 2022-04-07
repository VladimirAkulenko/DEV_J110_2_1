/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dev_j110_2_p1;

/**
 *
 * @author USER
 */
public class DEV_J110_2_P1 {

    public static void main(String[] args) {
               //Создание массива
        Person [] person = new Person[6];

        person[0] = new Teacher("Ronald", "Turner",Person.Gender.MALE, "Computer science",Teacher.Degree.PHD,"Programming paradigms");
        person[1] = new Teacher("Ruth", "Hollings",Person.Gender.FEMALE, "Jurisprudence",Teacher.Degree.CANDIDATE,"Domestic arbitration");

        person[2] = new Student("Leo", "Wilkinson",Person.Gender.MALE,"Computer science",Student.Stage.BACHELOR,3);
        person[3] = new Student("Anna", "Cunningham",Person.Gender.FEMALE,"World economy",Student.Stage.BACHELOR,1);
        person[4] = new Student("Jill", "Lundqvist",Person.Gender.FEMALE,"Jurisprudence",Student.Stage.MASTER,1);

        person[5] = new GraduateStudent("Ronald ", "Correa",Person.Gender.MALE, "Computer science", "Design of a functional programming language");

    Person.printAll(person); //Печатает данные из массива
    }
}
