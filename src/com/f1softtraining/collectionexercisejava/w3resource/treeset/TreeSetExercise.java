package com.f1softtraining.collectionexercisejava.w3resource.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExercise {
    //THESE EXERCISES ARE BASED ON W3RESOURCES.COM
    public static void main(String[] args) {
        //Exercise 1: Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
        System.out.println("\n\nCreating new Tree Set and adding colors: ");
        ColorsTreeSet colorsTreeSet = new ColorsTreeSet();
        colorsTreeSet.colors.add("Red"); //Gets printed in Ascending Order!!
        colorsTreeSet.colors.add("Blue");
        colorsTreeSet.colors.add("Black");
        System.out.println(colorsTreeSet.colors);

        //Exercise 2: Write a Java program to iterate through all elements in a tree set.
        System.out.println("\n\nIterating TreeSet: ");
        Iterator<String> itr = colorsTreeSet.colors.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //Exercise 3: Write a Java program to add all the elements of a specified tree set to another tree set.
        System.out.println("\n\nAdd all the elements in another Tree Set: ");
        TreeSet<String> addedTreeSet = new TreeSet<>();
        addedTreeSet.add("Violet");
        addedTreeSet.addAll(colorsTreeSet.colors);
        System.out.println(addedTreeSet); //Now this adds it to the last. I dont' understand yet.

        //Exercise 4: Write a Java program to create a reverse order view of the elements contained in a given tree set.
        System.out.println("\n\nReverse order view of elements in given tree: ");
        Iterator iterator = addedTreeSet.descendingIterator(); //I always look for a function called reverse which doens't fucking exist!!
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Exercise 5: Write a Java program to get the first and last elements in a tree set.
        System.out.println("\n\nFirst and Last element in a Tree Set: ");
        System.out.println(colorsTreeSet.colors.first());
            //System.out.println(colorsTreeSet.colors.pollFirst());//This does some fishy thing
            //System.out.println(colorsTreeSet.colors); //Just checked! pollFirst() returns and removes the element :o
        System.out.println(colorsTreeSet.colors.last());

        //Exercise 6: Write a Java program to clone a tree set list to another tree set.
        System.out.println("\n\nCloning a Tree Set into another Tree Set");
        TreeSet<String> clonedTreeSet = (TreeSet<String>) colorsTreeSet.colors.clone(); //Why cast? I know now ;)
        System.out.println(clonedTreeSet);

        //Exercise 7: Write a Java program to get the number of elements in a tree set.
        System.out.println("\n\nGet number of elements in a tree set: ");
        System.out.println(colorsTreeSet.colors.size());

        //Exercise 8: Write a Java program to compare two tree sets.
        System.out.println("\n\nComparing two tree sets: ");
        if(clonedTreeSet.equals(colorsTreeSet.colors)){
            System.out.println("Both Hash Sets are equal!!");
        }
        else {
            System.out.println("It's not equal!");
        }

        //Exercise 9: Write a Java program to find the numbers less than 7 in a tree set.
        System.out.println("Finding the numbers less than 7 on a tree set: ");
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        integerTreeSet.add(19);
        integerTreeSet.add(20);
        integerTreeSet.add(1);
        integerTreeSet.add(3);
        TreeSet<Integer> lessThanSeven;
        lessThanSeven = (TreeSet<Integer>) integerTreeSet.headSet(7);
        System.out.println(lessThanSeven);

        //Exercise 10: Write a Java program to get the element in a tree set which is greater than or equal to the given element.
        System.out.println("\n\nFinding elements in a tree set which is greater than or equal to given element: ");
        int givenElement = 2;
        System.out.println(integerTreeSet.ceiling(givenElement));

        //Exercise 11: Write a Java program to get the element in a tree set which is less than or equal to the given element.
        System.out.println("\n\nFinding elements in a tree set which is less than or equal to given element");
        System.out.println(integerTreeSet.floor(givenElement));

        //Exercise 12: Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element.
        System.out.println("\n\nStrictly greater than or equal to the given element: ");
        System.out.println(integerTreeSet.higher(givenElement));

        //Exercise 13: Write a Java program to get an element in a tree set which is strictly less than the given element.
        System.out.println("\n\nStrictly lesser than or equal to the given element: ");
        System.out.println(integerTreeSet.lower(givenElement));

        //Exercise 14: Write a Java program to retrieve and remove the first element of a tree set.
        System.out.println("\n\nRetrieve and remove the first element of the tree: ");
        System.out.println(integerTreeSet.pollFirst());

        //Exercise 15: Write a Java program to retrieve and remove the last element of a tree set.
        System.out.println("\n\nRetrieve and remove the last element of a tree set: ");
        System.out.println("Before poll: " + integerTreeSet);
        System.out.println(integerTreeSet.pollLast());
        System.out.println("After Poll: " + integerTreeSet);

        //Exercise 16: Write a Java program to remove a given element from a tree set.
        System.out.println("\n\nRemoving an element: ");
        integerTreeSet.remove(19);
        System.out.println(integerTreeSet);







    }
}
