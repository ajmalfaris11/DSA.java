/*   
 
    +--------+
    |  data  |
    +--------+   ---------> this is a node
    |  next  |
    +--------+

 
 */

public class SLinkedList {

    // Node
    class Node { // it'snot predefined class

        int data; // INT type
        Node next; // NODE type

        Node(int data) {
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    // Add Node to NodList
    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    // dispaly the Node List
    public void display(String name) {
        System.out.println(String.format("\n\n%s node values\n-----------------", name));
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        Node temp = head; //head node stored to tamp for travers other ways head will change
        while (temp != null) { //taversing the NodeList
            System.out.printf("%d, ", temp.data);
            temp = temp.next; 
        }
        System.out.println("\n\n");
    }

    // deleting Node

 public void delete(int data) {
    Node temp = head, prev = null;
    

    // Check if the head node needs to be deleted
    if (temp != null && temp.data == data) {
        head = temp.next;
        // If head was also the tail, update tail
        if (head == null) {
            tail = null;
        }
        return;
    }

    // Traverse the list to find the node to delete
    while (temp != null && temp.data != data) {
        prev = temp;
        temp = temp.next;
    }

    // If the node to delete was not found
    if (temp == null) {
        return;
    }

    // Update the next pointer of the previous node to skip the node to be deleted
    if (temp == tail) {
        tail = prev;
        if (tail != null) {
            tail.next = null;
        }
    } else {
        prev.next = temp.next;
    }
}


    // main method
    public static void main(String[] args) {
        SLinkedList list = new SLinkedList();

        // adding nod datas to Nod List
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.addNode(50);
        list.addNode(60);

        // call the display funciton to print nod values

        list.delete(20);
        list.display("list");

    }

}