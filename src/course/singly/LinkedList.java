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

        newwNode.next=head;
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
        Node newNode = new Node(data);
        if(position<0){
            System.out.println("Invalid position");
            return;
        }
        if(position==0){
            newNode.next = head;
            head =newNode;
            return;
        }
        Node current = head;
        int index = 0;
        
        while(current!=null && index<position-1){
            current = current.next;
            index++;
        }
        if(current==null){
            System.out.println("Invalid position! Out of bounds");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
        
    }

    public void printData(){
        Node current = head;
        if(current==null){
            System.out.println("List is empty");
            return;
        }
        while(current!=null){
            System.out.print(current.data+" ==> ");
            current = current.next;
        }
        
    }

    public static void main(String [] args){
        LinkedList list = new LinkedList();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.insertAtEnd(40);
        list.insertAtPosition(50,2);
        list.insertAtPosition(50,0);
        list.printData();
    }
    
}
