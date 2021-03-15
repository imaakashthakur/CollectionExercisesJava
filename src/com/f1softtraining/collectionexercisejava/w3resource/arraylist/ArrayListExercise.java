package com.f1softtraining.collectionexercisejava.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExercise {
    public static void main(String[] args) {
        //Exercise 1: Write a Java program to create a new array list, add some colors (string) and print out the collection.
        System.out.println("\n\nAdding Colors on an Array List and printing them: ");
        ColorsArrayList colorsArrayList = new ColorsArrayList();
        colorsArrayList.colors.add("Red");
        colorsArrayList.colors.add("Black");
        colorsArrayList.colors.add("Purple");
        System.out.println(colorsArrayList.colors);

        //Exercise 2: Write a Java program to iterate through all elements in a array list
        System.out.println("\n\nIterating through all elements: ");
        for(String color : colorsArrayList.colors){
            System.out.println(color);
        }

        //Exercise 3: Write a Java program to insert an element into the array list at the first position.
        System.out.println("\n\nInserting an element into the array list in first position: ");
        colorsArrayList.colors.add(0, "Orange");
        System.out.println(colorsArrayList.colors);

        //Exercise 4: Write a Java program to retrieve an element (at a specified index) from a given array list.
        System.out.println("\n\nRetrieving an element from given array List: ");
        System.out.println(colorsArrayList.colors.get(2));

        //Exercise 5: Write a Java program to update specific array element by given element.
        System.out.println("\n\nUpdating a specific array element by given element: ");
        colorsArrayList.colors.set(1, "BlackPink");
        System.out.println(colorsArrayList.colors);

        //Exercise 6: Write a Java program to remove the third element from a array list.
        System.out.println("\n\nRemoving the third element: ");
        colorsArrayList.colors.remove(2);
        System.out.println(colorsArrayList.colors);

        //Exercise 7: Write a Java program to search an element in a array list.
        System.out.println("\n\nSearching an element in a array list: ");
        System.out.println(colorsArrayList.colors.contains("Purple"));
        System.out.println(colorsArrayList.colors.indexOf("Purple"));

        //Exercise 8: Write a Java program to sort a given array list.
        System.out.println("\n\nSorting a given array list: ");
        Collections.sort(colorsArrayList.colors); //Uses a method from Collections. Point to be noted!
        System.out.println(colorsArrayList.colors);

        //Exercise 9: Write a Java program to copy one array list into another.
        System.out.println("\n\nCopying an array list into another: ");
        ArrayList<String> copiedArrayList = new ArrayList<>();
            //Collections.copy(copiedArrayList, exercise1.colors); This didn't work. Throws IndexOutofBoundException
        copiedArrayList = (ArrayList<String>) colorsArrayList.colors.clone(); //This did work. Casting from Object to String.
        System.out.println(copiedArrayList);

        //Exercise 10: Write a Java program to shuffle elements in a array list.
        System.out.println("\n\nShuggling elements in a array list: ");
        Collections.shuffle(copiedArrayList); //Again a method from Parent Interface Collection!!
        System.out.println(copiedArrayList); //Gives random shuffle everytime I ran it

        //Exercise 11: Write a Java program to reverse elements in a array list.
        System.out.println("\n\nReversing elements in a array list: ");
        Collections.reverse(colorsArrayList.colors);

        //Exercise 12: Write a Java program to extract a portion of a array list.
        System.out.println("\n\nExtracting a portion of a array list: ");
        System.out.println(colorsArrayList.colors.subList(0, 2)); //Didn't print index 2. So it's exclusive of Index 2.

        //Exercise 13: Write a Java program to compare two array lists.
        System.out.println("\n\nComparing two array lists: ");
        ArrayList<String> copiedArrayList1 = (ArrayList<String>) colorsArrayList.colors.clone();
        if(colorsArrayList.colors.equals(copiedArrayList1)){
            System.out.println(".equal operator on two different ArrayList objects with same data gives equal");
        }
        if(!(colorsArrayList.colors == copiedArrayList1)){
            System.out.println("== operator on them gave not equal!");
        }
        else{
            System.out.println("Gave 'Not Equal'");
        }

        //Exercise 14: Write a Java program of swap two elements in an array list.
        System.out.println("\n\nSwaping two elements in an ArrayList: ");
        NamesArrayList namesArrayList = new NamesArrayList();
        namesArrayList.names.add("Aakash");
        namesArrayList.names.add("Santosh");
        namesArrayList.names.add("Rishabh");

        Collections.swap(namesArrayList.names, 0, 2);
        System.out.println(namesArrayList.names);

        //Exercise 15: Write a Java program to join two array lists.
        System.out.println("\n\nJoin two array lists: ");
        copiedArrayList1.addAll(namesArrayList.names);
        System.out.println(copiedArrayList1);

        //Exercise 16: Write a Java program to clone an array list to another array list.
        System.out.println("\n\nCloning ArrayLists: ");
        ArrayList<String> clonedArrayList = (ArrayList<String>) namesArrayList.names.clone();
        System.out.println(clonedArrayList);

        //Exercise 17: Write a Java program to empty an array list
        System.out.println("\n\nEmptying an ArrayList: ");
        copiedArrayList1.clear();
        System.out.println(copiedArrayList1);

        //Exercise 18: Write a Java program to test an array list is empty or not
        System.out.println("\n\nTest if ArrayList is empty or not: ");
        if(copiedArrayList.isEmpty()){
            System.out.println("Is Empty!");
        }
        else{
            System.out.println("Not Empty!");
        }

        //Exercise 19: Write a Java program to trim the capacity of an array list the current list size.
        System.out.println("\n\nTrim the capacity of an arraylist: ");
        namesArrayList.names.add(null);
        System.out.println("Original ArrayList: "+ namesArrayList.names);
        namesArrayList.names.trimToSize();
        System.out.println(namesArrayList.names);

        //Exercise 20: Write a Java program to increase the size of an array list.
        System.out.println("\n\nIncreasing the size of an array: ");
        System.out.println("Initial Size: " + namesArrayList.names.size());
        namesArrayList.names.ensureCapacity(10);
        System.out.println("Final Size: " + namesArrayList.names.size());

        //Exercise 21: Write a Java program to replace the second element of a ArrayList with the specified element.
        System.out.println("\n\nReplacing element: ");
        System.out.println(namesArrayList.names.get(1));

        //Exercise 22: Write a Java program to print all the elements of a ArrayList using the position of the elements.
        System.out.println("\n\nPoint all the elements with position: ");
        for (int i = 0; i < colorsArrayList.colors.size(); i++){
            System.out.println(colorsArrayList.colors.get(i));
        }
    }
}
