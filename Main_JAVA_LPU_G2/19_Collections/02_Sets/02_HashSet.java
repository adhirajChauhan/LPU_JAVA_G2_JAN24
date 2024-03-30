import java.util.HashSet;

import java.util.Iterator;

class LPU{
    public static void main(String args[]){

        HashSet<Integer> set1 = new HashSet<>();
        //capacity -> capacity means the number of elements set1 can store (by defalut it will be 16)
        //loadFactor -> (by default it will be 0.75)

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        System.out.println("Before Set 1 : " + set1);

        //Add
        // set1.add(5);

        //Access
        // Iterator<Integer> itr = set1.iterator();

        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }

        // set1.remove(3);

        HashSet<Integer> set2 = new HashSet<>();

        set2.add(3);
        set2.add(4);
        // set2.add(5);
        System.out.println("Before Set 2 : " + set2);
        // set2.retainAll(set1);
        // set2.removeAll(set1);

        System.out.println(set1.containsAll(set2));

        // System.out.println("After Set 1 : " + set2);


    }
}










// Suppose you are given two sets of integers, A and B, represented as HashSet objects in Java. You are required to implement a Java program that performs the following operations:

// Calculate the intersection of sets A and B.
// Determine if set A is a subset of set B.
// Calculate the union of sets A and B.
// Your program should include the following methods:

// calculateIntersection(HashSet<Integer> setA, HashSet<Integer> setB): This method takes two HashSet objects setA and setB as input and returns a new HashSet containing the intersection of setA and setB.
// isSubset(HashSet<Integer> setA, HashSet<Integer> setB): This method takes two HashSet objects setA and setB as input and returns true if setA is a subset of setB, otherwise returns false.
// calculateUnion(HashSet<Integer> setA, HashSet<Integer> setB): This method takes two HashSet objects setA and setB as input and returns a new HashSet containing the union of setA and setB.