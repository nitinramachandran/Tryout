package com.nix.tryout.collections.list.linked;

import java.util.List;

public class LinkedListMain {

    public static void main(String[] args) {

        var intList = List.of(2, 4, 6, 8, 10, 11, 12, 13);
        LinkedListNode node = new LinkedListNode();
        node = node.generateLinkedListFromArrayList(intList);
        node.printAllValues(node);

        System.out.println("Value : " + node.getYoungestChild(node));
    }
}
