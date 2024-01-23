package com.sample;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Demo {
    public static void main(String[] args) {
        // HashSet code is for comparission
        HashSet<Integer> hashSet = new HashSet<>(); //unique and unordered
        hashSet.add(60);   //Adding element
        hashSet.add(70);
        hashSet.add(50);
        hashSet.add(80);
        hashSet.add(90);
        hashSet.add(100);
        System.out.println(hashSet);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();  // unique and ordered
        linkedHashSet.add(10);  // adding elements
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        linkedHashSet.add(20);
        linkedHashSet.add(40);
        linkedHashSet.add(50);
        linkedHashSet.add(60);
        linkedHashSet.add(60);
        linkedHashSet.remove(20);// removing element
        System.out.println(linkedHashSet);
        linkedHashSet.addAll(hashSet); // adding a collection
        System.out.println("****************** Traversing with lambda Expression");
        linkedHashSet.forEach(element -> {
            System.out.println("Value is " + element);
        });
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.size()); // Printing the size
        System.out.println(linkedHashSet.contains(15)); // Checking if linkedHashSet contains element 15
        System.out.println(linkedHashSet.isEmpty()); // checking if Linkedhashset is emty or not
        linkedHashSet.removeAll(hashSet);// remove elements of hashset added previously
        linkedHashSet.clear();// clear the linkedHashSet
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.isEmpty());

    }
}
