//Creating a linked List

public class Node{
    Node next = null;
    int data;

    
    //constructor
    public Node (int d){
        data =d;

    }

    void appendToTail(int d){
        Node end = new Node(d);
        Node n = this;
        while (n.next != null){
            n=n.next;

        }
        n.next =end;
    }

    
}