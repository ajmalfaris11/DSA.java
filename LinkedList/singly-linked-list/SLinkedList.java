/*   
 
    +--------+
    |  data  |
    +--------+   ---------> this is a node
    |  next  |
    +--------+

 
 */

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
}
