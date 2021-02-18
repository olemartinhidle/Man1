/**
 * Test class, written following guide from GeeksForGeeks
 * https://www.geeksforgeeks.org/doubly-linked-list/
 */
package editor;


public class DoublyLinkedList {
    Node head;

    public void addInFront(int new_data)
    {

        Node new_Node = new Node(new_data);


        new_Node.next = head;
        new_Node.prev = null;


        if (head != null)
            head.prev = new_Node;


        head = new_Node;
    }
    public void InsertAfter(Node prev_Node, int new_data)
    {


        if (prev_Node == null) {
            System.out.println("The given previous node cannot be NULL ");
            return;
        }


        Node new_node = new Node(new_data);


        new_node.next = prev_Node.next;


        prev_Node.next = new_node;


        new_node.prev = prev_Node;


        if (new_node.next != null)
            new_node.next.prev = new_node;
    }

    void addAtEnd(int new_data)
    {

        Node new_node = new Node(new_data);

        Node last = head;


        new_node.next = null;


        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }


        while (last.next != null)
            last = last.next;


        last.next = new_node;


        new_node.prev = last;
    }

}





