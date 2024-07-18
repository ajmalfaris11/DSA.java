/*   
 
    +--------+
    |  data  |
    +--------+   ---------> this is a node
    |  next  |
    +--------+

 
 */

import java.util.LinkedList;

public class SLinkedList {
    class Node { // it'snot predefined class

        int data;  //INT type
        Node next; //NODE type
        
        Node(int data){
            this.data = data;
        }
    }
    
    public Node head = null;
    public Node tail = null;
    
    public void addNode(int data){
        Node newNode = new Node(data);

        if( head == null ){
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode ;
    }

public void display(){
    if (head == null){
        System.out.println("list is empty");
        return;
    }

    Node temp = head;
    while (head != null){
        System.out.println(temp.data);
        temp = temp.next;
    }
}

public static void main(String[] args) {
    SLinkedList list = new SLinkedList();
    list.display();
}

}