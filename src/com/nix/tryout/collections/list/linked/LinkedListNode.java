package com.nix.tryout.collections.list.linked;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a LinkedList node with a bunch of functionalities.
 *
 */
public class LinkedListNode {
    int val;
    LinkedListNode next;

    private List<Integer> asList;

    public LinkedListNode() {

    }

    public LinkedListNode(int value) {
        this.val = value;
    }

    public LinkedListNode(LinkedListNode node) {
        this.next = node;
    }

    public LinkedListNode(LinkedListNode node, int value) {
        this.next = node;
        this.val = value;
    }
    /**
     * Returns a java.util.List with the values from the given node, and it's child nodes
     * @return java.util.List<Integer> with the values in the list
     */
    public List<Integer> getChildNodeValuesAsList(LinkedListNode node) {
        asList = new ArrayList<Integer>();

        while(node != null) {
            asList.add(node.val);
            node = node.next == null ? null : node.next;
        }
        return asList;
    }

    /**
     * Returns the last child node
     * @param - The parent LinkedListNode node
     * @return - The last child node in the LinkedList
     */
    public LinkedListNode getYoungestChild(LinkedListNode node) {
        if(node != null && node.next != null) {
            return getYoungestChild(node.next);
        }
        return node;
    }

    /**
     * Prints the values of the linkedList starting from the parent and iterating until the last node
     *
     * @param - LinkedListNode
     */
    public void printAllValues(LinkedListNode node) {
        LinkedListNode localNode = node;
        if(localNode == null) {
            localNode = this;
        }

        int counter = 0;
        while(localNode != null) {
            System.out.println("Node " + ++counter + " : " + localNode.val);
            localNode = localNode.next!= null ? localNode.next : null;
        }


    }

    /**
     * Generate a linkedList with values from the given List<Integer>
     * @param - List<Integer> intList
     * @return - Returns parent LinkedList node
     */
    public LinkedListNode generateLinkedListFromArrayList(List<Integer> intList) {
        LinkedListNode node = new LinkedListNode();
        for(Integer value : intList) {

            if(node.val == 0) {
                node.val = value;
            } else if(node.next == null) {
                node.next = new LinkedListNode(value);
            }
            else {
                LinkedListNode childNode = getYoungestChild(node);
                childNode.next = new LinkedListNode(value);
            }
        }
    return node;
    }
    @Override
    public String toString() {
        return "Value : " + this.val;
    }
}
