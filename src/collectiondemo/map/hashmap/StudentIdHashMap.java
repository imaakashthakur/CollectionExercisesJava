package collectiondemo.map.hashmap;

import collectiondemo.model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentIdHashMap {
    public static void main(String[] args) {
        Map<Integer, Student> studentHashMap = new HashMap<>(3);

        studentHashMap.put(1, new Student(1, "Santosh", "Pun", "Pokhara",
                "9812345678"));
        studentHashMap.put(2, new Student(2, "Rishav", "Pant", "Delhi",
                "73558123456"));
        studentHashMap.put(3, new Student(3, "Sabrin", "Luitel", "BiratNagar",
                "9898989898"));

        System.out.println(studentHashMap);

    }
}