package collectiondemo.set.hashset;

import collectiondemo.model.Student;

import java.util.HashSet;
import java.util.Set;

public class StudentsHashSet {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student(1, "Aakash", "Thakur", "Janakpur",
                "8748657483"));
        System.out.println(studentSet);

        Set<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        //Duplicate Values are not allowed. So takes 2 only once. This must be useful!
        evenNumbers.add(2);
        evenNumbers.add(6);
        //4 is stored before 6 but it's not sorted. HTF is this possible?
        evenNumbers.add(4);
        evenNumbers.add(8);
        System.out.println(evenNumbers);


    }
}