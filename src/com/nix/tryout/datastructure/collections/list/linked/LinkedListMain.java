package com.nix.tryout.datastructure.collections.list.linked;

import java.util.List;

public class LinkedListMain {

    public static void main(String[] args) throws LinkedListEmptyException {

        var intList = List.of(2, 4, 6, 8, 10, 11, 12, 13);
        var stringList = List.of("Nitin", "Ritika", "Siddhant");

        LinkedListNode parentNode1 = new LinkedListNode();
        parentNode1 = parentNode1.generateLinkedListFromArrayList(intList);
        System.out.println("Linked List : ");
        parentNode1.printAllValues(parentNode1);
        System.out.println("Last node from the list of Integer is : " + parentNode1.getYoungestChild(parentNode1));

        LinkedListNode parentNode2 = new LinkedListNode();

        parentNode2 = parentNode2.generateLinkedListFromArrayList(stringList);

        System.out.println("Linked List : ");
        parentNode2.printAllValues(parentNode2);
        System.out.println("Last node from the list of String : " + parentNode2.getYoungestChild(parentNode2));
    }
}
