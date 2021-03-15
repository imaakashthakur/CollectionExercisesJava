package collectiondemo.arraylist;

import collectiondemo.model.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentArrayList {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Aakash", "Thakur", "Janakpur,"
                , "9848652890"));
        studentList.add(new Student(2, "Sabrin", "Luitel", "Biratnagar"
                , "8764536473"));

        //Overrode toString() method to view String rather than Object representation of Student Class
        System.out.println(studentList.get(0));
        System.out.println(studentList.get(1));

        //Iterating using Iterator<>. This is the same as using enhanced for loop:
        Iterator<Student> iterator = studentList.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Initialised students ArrayList with elements of studentList
        List<Student> students = new ArrayList<>(studentList);
        System.out.println("\n" + students);

        studentList.forEach(student -> {
            System.out.println("Name: " + student.getFirstName() + " | ID: " + student.getId());
        });
    }
}