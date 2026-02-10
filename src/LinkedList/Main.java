package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insertLinkedList(1,0);
        singleLinkedList.insertLinkedList(2,1);
        singleLinkedList.insertLinkedList(3,2);
        singleLinkedList.insertLinkedList(4,3);
        singleLinkedList.traverseLinkedList();

        //Returns false
        System.out.println(singleLinkedList.searchValue(5));
        //Returns true
        System.out.println(singleLinkedList.searchValue(3));

        singleLinkedList.deleteLinkedList(2);
        singleLinkedList.traverseLinkedList();

    }
}