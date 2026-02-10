package DoubleLinkedList;


public class DoubleLinkedList {
    public DoubleNode head;
    public DoubleNode tail;
    public int size;

    public void createDoubleLinkedList(int nodeValue) {
        DoubleNode node = new DoubleNode();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
    }

    //Insert element in a linked list
    //1. if the link doesn't exist
    //2. inserting element at the beginning
    //3.inserting element at the end
    //4.inserting anywhere else

    public void insertDoubleLinkedListNode(int nodeValue, int location) {
        DoubleNode node = new DoubleNode();
        node.value = nodeValue;

        if (head == null){
            createDoubleLinkedList(nodeValue);
            return;
        } else if (location == 0){
            node.next = head;
            node.previous = null;
            head = node;
        } else if (location >= size) {
            node.next = null;
            node.previous = tail;
            tail.next = node;
            tail = node;
        } else {
            DoubleNode tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            DoubleNode nextNode = tempNode.next;
            node.previous = tempNode;
            node.next = tempNode.next;
            tempNode.next = node;
            node.next.previous = nextNode;
        }
        size++;
    }

    // Traversing through a linked list
    public void traverseDoubleLinkedList(){
        if (head == null) {
            System.out.println("Linked list does not exist");
        } else {
            DoubleNode tempNode = head;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i != size -1){
                    System.out.print(" <-> ");
                }
                tempNode = tempNode.next;

            }
            System.out.println("\n");

        }

    }

    // Traversing through a linked list
    public void reverseTraverseDoubleLinkedList(){
        if (head == null) {
            System.out.println("Linked list does not exist");
        } else {
            DoubleNode tempNode = tail;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i != size -1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.previous;

            }
            System.out.println("\n");

        }
    }

    //PRACTICE 1: given a value, search for that element and return a boolean if the element exist or not.
    public boolean searchValue(int nodeValue) {
        DoubleNode tempNode = head;
        while (tempNode != null) {
            if (tempNode.value == nodeValue) {
                return true;
            }
            tempNode = tempNode.next;
        }
        return false;
    }


    //PRACTICE 2: Given a location Implement a Delete method.
    public void deleteDoubleLinkedListNode(int location) {

        if (head == null) {
            System.out.println("Linked list does not exist");
            return;
        } else if (location == 0) {
            if (size == 1) {
                head = null;
                tail = null;
                size = 0;
                return;
            }
            head = head.next;
            size--;
        } else if (location >= size - 1) {
            DoubleNode tempNode = head;
            for (int i = 0; i < size - 2; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head && size == 1) {
                head = tail = null;
                size = 0;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else {
            DoubleNode tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }


}
