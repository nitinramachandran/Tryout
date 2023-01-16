package com.nix.tryout.collections.list.linked;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

    public LinkedListNode getYoungestChild(LinkedListNode node) {
        if(node != null && node.next != null) {
            return getYoungestChild(node.next);
        }
        return node;
    }

    public LinkedListNode generateLinkedListFromArrayList(List<Integer> intList) {
        LinkedListNode node = new LinkedListNode();
        for(Integer value : intList) {
            if(node.val == 0) {
                node.val = value;
            } else {
                LinkedListNode childNode = new LinkedListNode(value);
                node.next = childNode;
            }
        }
    return node;
    }
}
