package com.f1softtraining.collectionexercisejava.w3resource.map;

public class HashMapExercise {
    //Got these exercises form W3Resource for practice
    public static void main(String[] args) {
        StudentsHashMap studentsHashMap = new StudentsHashMap();
        studentsHashMap.students.put(1, "Aakash");
        studentsHashMap.students.put(2, "Jikesh");
        studentsHashMap.students.put(3, "Sabrin");
        studentsHashMap.students.put(4, "Sandhya");
        studentsHashMap.students.put(5, "Rashim");

        System.out.println(studentsHashMap.students);

        studentsHashMap.students.put(5, "Lucky");
        System.out.println(studentsHashMap.students);
    }
}