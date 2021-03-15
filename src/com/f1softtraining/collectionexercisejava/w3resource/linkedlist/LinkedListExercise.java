package com.f1softtraining.collectionexercisejava.linkedlist;

import java.util.*;

public class LinkedListExercise {
    public static void main(String[] args) {

        //Exercise 1: Write a Java program to append the specified element to the end of a linked list.
        StudentsLinkedList studentsLinkedList = new StudentsLinkedList();
        studentsLinkedList.names.add("Aakash");
        studentsLinkedList.names.add("Samir");
        studentsLinkedList.names.add("Bibek"); //Every new data is attached to the last node. Hence the tail.
        System.out.println("\n\nAppending to the end of linked list: ");
        System.out.println(studentsLinkedList.names);

        //Exercise 2: Write a Java program to iterate through all elements in a linked list.
        System.out.println("\n\nIterating through the Linked List using for loop!: ");
        for(int i = 0; i < studentsLinkedList.names.size(); i++){
            System.out.println(studentsLinkedList.names.get(i));
        }

        //Exercise 3: Write a Java program to iterate through all elements in a linked list starting at the specified position.
        int startingPos = 1;
        System.out.println("\n\nIterating from a specified Starting Position: ");
        for(int i = startingPos; i < studentsLinkedList.names.size(); i++){
            System.out.println(studentsLinkedList.names.get(i));
        }


        //Exercise 4: Write a Java program to iterate a linked list in reverse order.
        Iterator it = studentsLinkedList.names.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //Exercise 5: Write a Java program to insert the specified element at the specified position in the linked list.
        System.out.println("\n\nAdding an element at a specified position: ");
        studentsLinkedList.names.add(2, "Added Student at 2!");
        System.out.println(studentsLinkedList.names);

        //Exercise 6: Write a Java program to insert elements into the linked list at the first and last position.
        System.out.println("\n\nAdding an element at the first and last position: ");
        studentsLinkedList.names.addFirst("First Student");
        studentsLinkedList.names.addLast("Last Student");
        System.out.println(studentsLinkedList.names);

        //Exercise 7: Write a Java program to insert the specified element at the front of a linked list.
        System.out.println("\n\nInserting an element at the front of a linked list: ");
        studentsLinkedList.names.offerFirst("Offer First");
        System.out.println(studentsLinkedList.names);

        //Exercise 8: Write a Java program to insert the specified element at the end of a linked list.
        System.out.println("\n\nInserting an element at the last of a linked list: ");
        studentsLinkedList.names.offerLast("Offer Last");
        System.out.println(studentsLinkedList.names);

        //Exercise 9: Write a Java program to insert some elements at the specified position into a linked list.
        System.out.println("\n\nInserting an element at the specified position of the Linked List: ");
        final int specifiedPos = 2;
        studentsLinkedList.names.set(specifiedPos, "Inserted at 2");
        System.out.println(studentsLinkedList.names);

        //Exercise 10: Write a Java program to get the first and last occurrence of the specified elements in a linked list.
        System.out.println("\n\nGetting the first and last occurence of the specified elements: ");
        System.out.println(studentsLinkedList.names.getFirst());
        System.out.println(studentsLinkedList.names.getLast());

        //Exercise 11: Write a Java program to display the elements and their positions in a linked list.
        System.out.println("\n\nDisplaying the elements and their positions in a linked list: ");
        for(int i = 0; i < studentsLinkedList.names.size(); i++){
            System.out.println("Position: "+(i+1)+", Name: "+ studentsLinkedList.names.get(i)+".");
        }

        //Exercise 12: Write a Java program to remove a specified element from a linked list.
        System.out.println("\n\nRemoving a specified element (Samir) from a Linked List: ");
        studentsLinkedList.names.remove("Samir");
        System.out.println(studentsLinkedList.names);

        //Exercise 13: Write a Java program to remove first and last element from a linked list.
        System.out.println("\n\nRemoving First and Last element from Linked List: ");
        studentsLinkedList.names.removeFirst();
        studentsLinkedList.names.removeLast();
        System.out.println(studentsLinkedList.names);

        //Exercise 14: Write a Java program to remove all the elements from a linked list.
        System.out.println("\n\nRemoving all the elements from the Linked List: ");
            //studentsLinkedList.names.remove(); This only removed the first node. I was hoping the Linked List will be cleared.
            //studentsLinkedList.names.clear();   //Clear does the job well!
        System.out.println(studentsLinkedList.names);

        //Exercise 15: Write a Java program of swap two elements in a linked list.
        System.out.println("\n\nSwap two elements in linked list: ");
        Collections.swap(studentsLinkedList.names, 0, 1);
        System.out.println(studentsLinkedList.names);

        //Exercise 16: Write a Java program to shuffle the elements in a linked list.
        System.out.println("\n\nShuffling the elements in a linked list: ");
        Collections.shuffle(studentsLinkedList.names);
        System.out.println(studentsLinkedList.names);

        //Exercise 17: Write a Java program to join two linked lists.
        System.out.println("\n\nJoining 2 Linked List: ");
        TeacherLinkedList teacherLinkedList = new TeacherLinkedList();
        teacherLinkedList.names.add("Janaki");
        teacherLinkedList.names.add("Santosh Pun");
        teacherLinkedList.names.add("Manjit Shakya");
        System.out.println(teacherLinkedList.names);
        studentsLinkedList.names.addAll(teacherLinkedList.names);
        System.out.println(studentsLinkedList.names);

        //Exercise 18: Write a Java program to clone an linked list to another linked list.
        System.out.println("\n\nCloned List: ");
        LinkedList<String> clonedLinkedList = new LinkedList<>();
        clonedLinkedList = (LinkedList<String>) studentsLinkedList.names.clone();
        System.out.println(clonedLinkedList);

        //Exercise 19: Write a Java program to remove and return the first element of a linked list.
        System.out.println("\n\nRemoving and returning the first element of a Linked List: ");
        System.out.println("Removed Element: " + clonedLinkedList.pop());
        System.out.println(clonedLinkedList);

        //Exercise 20: Write a Java program to retrieve but does not remove, the first element of a linked list.
        System.out.println("\n\nRetrieve but not remove the first element of Linked List: ");
        System.out.println(studentsLinkedList.names.getFirst()); //this throws exception if nothing found
        System.out.println(studentsLinkedList.names.peekFirst()); //both the methods does the same thing! This returns null

        //Exercise 21: Write a Java program to retrieve but does not remove, the last element of a linked list.
        System.out.println("\n\nRetrieve but not remove the last element of Linked List: ");
        System.out.println(studentsLinkedList.names.getLast());
        System.out.println(studentsLinkedList.names.peekLast());

        //Exercise 22: Write a Java program to check if a particular element exists in a linked list.
        System.out.println("\n\nChecking if the element 'Manjit Shakya' exist in the Linked List: ");
        if(studentsLinkedList.names.contains("Manjit Shakya")){
            System.out.println("Manjit is found. It is there in the Linked List!");
        }
        else {
            System.out.println("Not Found");
        }

        //Exercise 23: Write a Java program to convert a linked list to array list.
        System.out.println("\n\nConverting a Linked List to an Array List: ");
        System.out.println(studentsLinkedList.names.getClass());
            //studentsLinkedList.names.toArray(); This didn't work!
            //System.out.println(studentsLinkedList.names.getClass());
        List<String> toArrayList = new ArrayList<>(clonedLinkedList);
        System.out.println(toArrayList);
        System.out.println(toArrayList.getClass());

        //Exercise 24: Write a Java program to compare two linked lists.
        System.out.println("\n\nComparing two Linked List: ");
        if(studentsLinkedList.names.equals(teacherLinkedList.names)){
            System.out.println("Both the Linked Lists are equal! ");
        }
        else{
            System.out.println("Not equal!");
        }

        //Exercise 25: Write a Java program to test an linked list is empty or not.
        System.out.println("\n\nChecking if a Linked List is empty or not: ");
        if(studentsLinkedList.names.isEmpty()){
            System.out.println("It is empty!");
        }
        else{
            System.out.println("Not empty!");
        }

        //Exercise 26: Write a Java program to replace an element in a linked list.
        System.out.println("\n\nReplacing an element in a Linked List: ");
        Collections.replaceAll(teacherLinkedList.names, "Manjit Shakya", "Manjit Dai"); //I did this. The solution just set() an element
        System.out.println(teacherLinkedList.names);

    }
}
