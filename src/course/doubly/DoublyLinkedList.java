package course.doubly;

public class DoublyLinkedList{
  private Node head;
  private Node tail;

  public DoublyLinkedList(){
    head = null;
    tail = null;
  }

  public void addFront(int data){
    Node newNode = new Node(data);
    if(head==null){
      head = newNode;
      tail = newNode;
    } else {
      head.prev = newNode;
      newNode.next =head;
      head = newNode;
    }
  }

  public void addEnd(int data){
    Node newNode = new Node(data);
    if(tail==null){
      head=tail=newNode;
    } else{
      tail.next=newnode;
      newNode.prev=tail;
      tail=newNode; 
    }
  }

  public void addAtPosition(int data, int position){
    if(position<0) {
      System.out.println("Invalid position");
      return;
    }
    if(position==0){
      addFront(data);
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
    Node newNode = new Node(data);
    newNode.next = current.next;
    newNode.prev = current;
    if(current.next!=null){
      current.next.prev = newNode;
    } else
      tail = newNode;
    current.next = newNode;
  }

  public void deleteFront(){
    if (head==null){
      System.out.println("List is empty");
      return;
    }
    if(head.next==null){
      head=null;
      tail=null;
    } else {
      head=head.next;
      head.prev=null;
    }
  }

  public  void deleteEnd(){
    if (tail==null){
      System.out.println("List is empty");
      return;
    }
    if(tail.prev==null) {
      tail = null;
      return;
    }
    tail=tail.prev;
    tail.next = null;
  }

  public void deleteAtPosition(int position){
    if(position<0){
      System.out.println("Invalid position");
    }
    if(position==0){
      deleteFront();
    }
    Node curremt = head;
    int index = 0;
    while (index<position-1 && curremt!=null){
      curremt = curremt.next;
      index++;
    }
    if(curremt==null){
      System.out.println("List is empty");
    }
    if(curremt.next==null){
      deleteEnd();
    }
    else{
      curremt.next.prev = curremt.prev;
    }
  }

  public void displayBackward() {
    Node current = tail;
    while(current!=null){
      System.out.println(current.data+ "\t");
      current = current.next;
    }
    System.out.println();

  }

  public void displayForward() {
    Node current = head;
    while(current!=null){
      System.out.println(current.data+ "\t");
      current = current.next;
    }
    System.out.println();
  }


}