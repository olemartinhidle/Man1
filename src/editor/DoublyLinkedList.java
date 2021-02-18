package editor;

import java.util.ListIterator;

public class DoublyLinkedList {

    Node head, tail = null;


    public void addNode(String data) {

        Node newNode = new Node(data);

        if(head == null) {

            head = tail = newNode;

            head.previous = null;

            tail.next = null;
        }
        else {

            tail.next = newNode;

            newNode.previous = tail;

            tail = newNode;

            tail.next = null;
        }
    }

    public void display() {

        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while(current != null) {


            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {

        DoublyLinkedList List = new DoublyLinkedList();
        //Add nodes to the list
        List.addNode("A");
        List.addNode("B");
        List.addNode("C");
        List.addNode("D");
        List.addNode("E");
        List.addNode("F");
        List.addNode("G");
        List.addNode("H");
        List.addNode("I");
        List.addNode("J");
        List.addNode("K");
        List.addNode("L");
        List.addNode("M");
        List.addNode("N");
        List.addNode("O");
        List.addNode("P");
        List.addNode("Q");
        List.addNode("R");
        List.addNode("S");
        List.addNode("T");
        List.addNode("U");
        List.addNode("V");
        List.addNode("W");
        List.addNode("X");
        List.addNode("Y");
        List.addNode("Z");
        List.addNode("Æ");
        List.addNode("Ø");
        List.addNode("Å");
        List.addNode("a");
        List.addNode("b");
        List.addNode("c");
        List.addNode("d");
        List.addNode("e");
        List.addNode("f");
        List.addNode("g");
        List.addNode("h");
        List.addNode("i");
        List.addNode("j");
        List.addNode("k");
        List.addNode("l");
        List.addNode("m");
        List.addNode("n");
        List.addNode("o");
        List.addNode("p");
        List.addNode("q");
        List.addNode("r");
        List.addNode("s");
        List.addNode("t");
        List.addNode("u");
        List.addNode("v");
        List.addNode("w");
        List.addNode("x");
        List.addNode("y");
        List.addNode("z");
        List.addNode("æ");
        List.addNode("ø");
        List.addNode("å");
        List.addNode("1");
        List.addNode("2");
        List.addNode("3");
        List.addNode("4");
        List.addNode("5");
        List.addNode("6");
        List.addNode("7");
        List.addNode("8");
        List.addNode("9");
        List.addNode(",");
        List.addNode(".");
        List.addNode(";");
        List.addNode(":");
        List.addNode("!");
        List.addNode("?");
        List.addNode(" ");
        List.addNode("" +
                "");
        List.display();


    }
}