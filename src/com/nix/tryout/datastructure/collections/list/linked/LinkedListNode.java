package com.nix.tryout.datastructure.collections.list.linked;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents a LinkedList node with a bunch of functionalities.
 * The Linked list should be capable of accepting any kind of object
 * which is represented by the generic notation 'E'
 */
@SuppressWarnings("ALL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LinkedListNode<E> {
    E payload;
    LinkedListNode<E> next;

    public LinkedListNode(E value) {
        this.payload = value;
    }

    /**
     * Returns a java.util.List with the values from the given node, and it's child nodes
     * @return java.util.List<Integer> with the values in the list
     */
    public List<E> getChildNodeValuesAsList(LinkedListNode<E> node) {
        List<E> asList = new ArrayList<>();

        while(node != null) {
            asList.add(node.payload);
            node = node.next == null ? null : node.next;
        }
        return asList;
    }

    /**
     * Returns the last child node recursively
     * @param - The parent LinkedListNode node
     * @return - The last child node in the LinkedList
     */
    public LinkedListNode<E> getYoungestChild(LinkedListNode node) {
        if(node != null && node.next != null) {
            return getYoungestChild(node.next);
        }
        return node;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkedListNode<?> that = (LinkedListNode<?>) o;
        return payload.equals(that.payload) && Objects.equals(next, that.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payload, next);
    }

    public LinkedListNode deleteNode(LinkedListNode node) {
        return null;
    }

    /**
     * Inserts a new node to the end of the Linked List
     * @param node
     * @param position (Optional)
     * @param E payload (Optional)
     */
    public void insertNode(LinkedListNode node, E payload, Integer position) {
        if (Objects.isNull(position)) {
            LinkedListNode tailNode = getYoungestChild(this);
            tailNode.next = buildNode(node, payload);
        } else {

        }
    }

    /**
     * Returns a node with payload set if payload not null
     * @param node
     * @param payload (Optional)
     * @return
     */
    private LinkedListNode<E> buildNode(LinkedListNode node, E payload) {
        LinkedListNode localNode = node;
        if (!Objects.isNull(payload)) {
            localNode.payload = payload;
        }
        return localNode;
    }

    /**
     * Prints the values of the linkedList starting from the parent and iterating until the last node
     *
     * @param - LinkedListNode
     */
    public void printAllValues(LinkedListNode<E> node) throws LinkedListEmptyException{
        if(node == null) {
            throw new LinkedListEmptyException("The LinkedList node is empty or null");
        }
        LinkedListNode<E> localNode = node;
        if(localNode == null) {
            localNode = this;
        }

        int counter = 0;
        while(localNode != null) {
            System.out.println("Node " + ++counter + " : " + localNode.payload);
            localNode = localNode.next!= null ? localNode.next : null;
        }
    }

    /**
     * Generate a linkedList with values from the given List<Integer>
     * @param - List<Integer> objectList
     * @return - Returns parent LinkedList node
     */
    public LinkedListNode<E> generateLinkedListFromArrayList(@NotNull List<E> objectList) {
        LinkedListNode<E> node = new LinkedListNode();
        for(E obj : objectList) {

            if(node.payload == null) {
                node.payload = obj;
            } else if(node.next == null) {
                node.next = new LinkedListNode(obj);
            }
            else {
                LinkedListNode childNode = getYoungestChild(node);
                childNode.next = new LinkedListNode(obj);
            }
        }
    return node;
    }
    @Override
    public String toString() {
        return this.payload.toString();
    }
}
