package org.example.collections;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

        // Sets

        //Set<String> stringSet = new HashSet<>();
        //Set<String> stringSet = new LinkedHashSet<>();
        Set<String> stringSet = new TreeSet<>();

        stringSet.add("Hi");
        stringSet.add("Aaa");
        stringSet.add("Zzz");
        stringSet.add("There");
        ((NavigableSet)stringSet).lower("Z");

        //System.out.println(stringSet);

        // Lists
        //List<String> stringList = new ArrayList<>();
        List<String> stringList = new Vector<>();
        stringList.add("Hello");
        stringList.add("Hello");
        stringList.add("Hello");
        stringList.add("World!");

        //System.out.println(stringList);

        stringSet.addAll(stringList);

        //System.out.println(stringSet);


        // Queue
        //Queue<String> stringQueue = new LinkedList<>();
        Deque<String> stringQueue = new LinkedList<>();
        stringQueue.add("Howdy");
        stringQueue.add("Partner");
        stringQueue.offer("Yee-haw!");

        //System.out.println(stringQueue);

        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("A");
        priorityQueue.add("C");
        priorityQueue.add("M");
        priorityQueue.add("B");





    }
}
