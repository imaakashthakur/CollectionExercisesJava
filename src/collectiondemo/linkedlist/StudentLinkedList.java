package collectiondemo.linkedlist;

import collectiondemo.model.Student;

import java.util.LinkedList;
import java.util.List;

public class StudentLinkedList {
    public static void main(String[] args) {
        List<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(new Student(1, "Aakash", "Thakur", "Janakpur",
                "9848652890"));
        System.out.println(studentLinkedList);
    }
}
