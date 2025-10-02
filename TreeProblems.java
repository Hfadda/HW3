/*
 * *** Hannah Fadda / 002 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

    /**
     * Method different()
     * <p>
     * Given two TreeSets of integers, return a TreeSet containing all elements
     * that are NOT in both sets. In other words, return a TreeSet of all the
     * elements that are in one set but not the other.
     */

    public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

        // INSERT CODE HERE - DO NOT FORGET TO PLACE YOUR NAME ABOVE
        //
        // This can be done numerous ways, but once such will only that
        // *several* lines of code. Hint: create two temporary TreeSets and utilize the
        // methods retainAll(), addAll(), and removeAll(). But in the end, get something to work.
        //create two temps to modify
        Set<Integer> tempA = new TreeSet<>(setA);
        Set<Integer> tempB = new TreeSet<>(setB);
        //find the values in A that arent in B and values in B that arent in A
        tempA.removeAll(setB);
        tempB.removeAll(setA);
        //add the differences
        tempB.addAll(tempA);
        return tempB;
    }


    /**
     * Method removeEven()
     * <p>
     * Given a treeMap with the key as an integer, and the value as a String,
     * remove all <key, value> pairs where the key is even.
     */

    public static void removeEven(Map<Integer, String> treeMap) {

        // INSERT CODE HERE.
        Iterator<Integer> x = treeMap.keySet().iterator();
        //iterate through treeMap
        while (x.hasNext()) {
            int key = x.next();
            //if key is even, remove it
            if (key % 2 == 0) {
                x.remove();
            }
        }
        return;
    }


    /**
     * Method treesEqual()
     * <p>
     * Given two treeMaps, each with the key as an integer, and the value as a String,
     * return a boolean value indicating if the two trees are equal or not.
     */

    public boolean treesEqual(Map<Integer, String> tree1, Map<Integer, String> tree2) {

        // INSERT CODE HERE
        return tree1.equals(tree2);

    }

} // end treeProblems class
