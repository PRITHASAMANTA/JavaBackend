package org.example;

import org.hibernate.Session;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Student s1 = new Student();

            s1.setsName("Navin");
            s1.setsAge(30);
            s1.getRollNo(101);

        Session

            System.out.println(s1);
    }
}