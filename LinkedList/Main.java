package LinkedList;


public class Main {

    public static void main(String[] args) {

//        create object
        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.makeEmpty();
        myLinkedList.append(1);
        myLinkedList.append(2);

        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeLast().value);
        // (1) Item - Returns 1 Node
        System.out.println(myLinkedList.removeLast().value);
        // (0) Items - Returns null
        System.out.println(myLinkedList.removeLast());

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();
        myLinkedList.printAll();

        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 4
            Tail: 4
            Length: 1

            Linked List:
            4

        */

    }

}
