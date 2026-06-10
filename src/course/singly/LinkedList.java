package course.singly;

public class LinkedList {

    class Node{
        public int data;
        public Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node head = null;
    public void addNode(int data){}

    public void insertAtBeginning(int data){
        Node newwNode = new Node(data);
        if(head==null){
            head = newwNode;
            return;
        }

        newwNode.next=head.next;
        head=newwNode;
    }

    public void insertAtEnd(int data){
        Node newwNode = new Node(data);
        if(head==null) {
            head = newwNode;
            return;
        }
        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next=newwNode;
    }

    public void insertAtPosition(int data, int position){
        Node newwNode = new Node(data);
    }

}
