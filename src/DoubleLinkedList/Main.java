package DoubleLinkedList;

public class Main {
    static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.insertDoubleLinkedListNode(1,0);
        doubleLinkedList.insertDoubleLinkedListNode(2,1);
        doubleLinkedList.insertDoubleLinkedListNode(3,2);
        doubleLinkedList.insertDoubleLinkedListNode(4,3);
        doubleLinkedList.traverseDoubleLinkedList();

         //Returns false
         System.out.println(doubleLinkedList.searchValue(5));
         //Returns true
         System.out.println(doubleLinkedList.searchValue(3));

         //Delete a node
        doubleLinkedList.deleteDoubleLinkedListNode(2);
        doubleLinkedList.traverseDoubleLinkedList();


    }
}
