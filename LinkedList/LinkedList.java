package LinkedList;

public class LinkedList {

//    initialize
    private Node head;
    private Node tail;
    private int length;

//    create Node class + Node constructor to assign next value to current value
    class Node {
        int value;
        Node next;

        public Node (int value) {
            this.value = value;
        }
    }

//    create LinkedList constructor
    public LinkedList (int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }


    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
//        head as temp traverse and print each value till null
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
//        if both and tail is null (empty linked list)
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length: " + length);
        System.out.println("\nLinked List:");

        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

//    emptying the linked list first
    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void append (int value) {
        Node newNode = new Node(value);

//        if linked list is empty
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
//            1. next pointer of tail 2. assign tail to the pointer
            tail.next = newNode;
            tail = newNode;
        }
//        increase length of linked list
        length++;
    }

    public Node removeLast() {
//        case 1: when initial linked list is empty
        if (length == 0) {
            return null;
        }
        Node temp = head;
        Node pre = head;

        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        length --;

        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;

    }

    public void prepend (int value) {
//        create new node with value
        Node newNode = new Node(value);
//        when linked list is empty
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }


}


    



