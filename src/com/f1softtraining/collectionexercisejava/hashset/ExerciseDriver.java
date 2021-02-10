package com.f1softtraining.collectionexercisejava.hashset;

import java.util.*;

public class ExerciseDriver {
    public static void main(String[] args) {
        //Exercise 1: Write a Java program to append the specified element to the end of a hash set
        System.out.println("\n\nAppend specified element to the end of a hashset: ");
        StudentsHashSet studentsHashSet = new StudentsHashSet();
        studentsHashSet.names.add("Aakash");
        studentsHashSet.names.add("Pradip");
        studentsHashSet.names.add("Suresh"); //This goes to the front!
        System.out.println(studentsHashSet.names);

        //Exercise 2: Write a Java program to iterate through all elements in a hash list.
        System.out.println("\n\nIterating: ");
        Iterator<String> itr = studentsHashSet.names.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //Exercise 3: Write a Java program to get the number of elements in a hash set.
        System.out.println("\n\nGetting the number of elements in a hash set: ");
        System.out.println(studentsHashSet.names.size());

        //Exercise 4: Write a Java program to empty an hash set.
        System.out.println("\n\nEmptying a Hash Set: ");
            //studentsHashSet.names.clear(); //Not clearing to reuse. Clear does delete every element in the HashSet
        System.out.println(studentsHashSet.names);

        //Exercise 5: Write a Java program to test a hash set is empty or not.
        System.out.println("\n\nChecking if a hash set is empty or not: ");
        if(studentsHashSet.names.isEmpty()){
            System.out.println("Empty!");
        }
        else {
            System.out.println("Not Empty!");
        }

        //Exercise 6: Write a Java program to clone a hash set to another hash set.
        System.out.println("\n\nCloning: ");
        HashSet<String> clonedHashSet = (HashSet<String>) studentsHashSet.names.clone();
        System.out.println(clonedHashSet);

        //Exercise 7: Write a Java program to convert a hash set to an array.
        System.out.println("\n\nConverting an Hash Set to an array: ");
        String[] convertedArray = new String[10];
        studentsHashSet.names.toArray(convertedArray);
        for(int i = 0; i < convertedArray.length; i++ ){
            System.out.print(convertedArray[i] + ", ");
        }




        //Exercise 8: Write a Java program to convert a hash set to a tree set.
        System.out.println("\n\nConverting to a Tree Set: ");
        System.out.println("Before Conversion HashSet: " + clonedHashSet);
        System.out.println("Before Conversion Class: " + clonedHashSet.getClass());
        Set<String> convertedTreeSet = new TreeSet<>(clonedHashSet);
        System.out.println(convertedTreeSet); //This printed the elements upside down.
        System.out.println("After Conversion Class: " + convertedTreeSet.getClass());

        //Exercise 9: Write a Java program to convert a hash set to a List/ArrayList.
        System.out.println("\n\nConverting a Hash Set into a List/Array List: ");
        List<String> convertedArrayList = new ArrayList<>(clonedHashSet);
        System.out.println(convertedArrayList); //Now this agains prints the same as a HashSet does

        //Exercise 10: Write a Java program to compare two hash set.
        System.out.println("\n\nComparing two Hash Sets: ");
        if(clonedHashSet.equals(studentsHashSet.names)){
            System.out.println("Its equal!");
        }
        else{
            System.out.println("Its not equal!");
        }

        //Exercise 11: Write a Java program to compare two sets and retain elements which are same on both sets.
        System.out.println("\n\nComparing two sets and retaining elements which are same on both sets: ");
        System.out.println(studentsHashSet.names);
        HashSet<String> tempHashSet = new HashSet<>();
        tempHashSet.add("Aakash");
        tempHashSet.add("Jay");
        tempHashSet.retainAll(studentsHashSet.names);
        System.out.println(tempHashSet);

        //Exercise 12: Write a Java program to remove all of the elements from a hash set.
        System.out.println("\n\nRemoving all elements from a Hash Set: ");
        tempHashSet.clear();
        System.out.println(tempHashSet);





    }
}
