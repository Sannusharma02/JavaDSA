package course.singly;
import java.util.Scanner;

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

    public void deleteFromBeginning(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        head = head.next;
    }

    public void deleteFromEnd(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node current = head;
        while(current.next.next!=null)
            current = current.next;
        current.next=null;
     }

     public void deleteFromPosition(int position){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        if(position<0){
            System.out.println("Invalid position");
            return;
        }
         
        if(position==0){
            head=head.next;
            return;
        }
         
        for(int i=0; i < position-1 && current != null; i++){
            current = current.next;
        }

         if(current==null || current.next==null){
             System.out.println("Invalid position! Out of bounds");
             return;
         }

         current.next = current.next.next;  
     }

    public boolean searchData(int data){
        Node current = head;
        while(current!=null){
            if(current.data==data)
                return true;
            current = current.next;
        }
        return false;
    }

    public static void printMenu(){
        System.out.println("********** Menu **********");
        System.out.println("Enter 1 To Insert");
        System.out.println("Enter 2 To Delete");
        System.out.println("Enter 3 To Search");
        System.out.println("Enter 4 To Print");
        System.out.println("Enter 5 To EXIT");
        System.out.println("**************************");
    }

    public static void printInsertMenu(){
        System.out.println("Press 1 to insert at head");
        System.out.println("Press 2 to insert at tail");
        System.out.println("Press 3 to insert at specific position");
    }

    public static void printDeleteMenu(){
         System.out.println("Press 1 to delete from head");
         System.out.println("Press 2 to delete from tail");
         System.out.println("Press 3 to delete from specific position");
    }
    
    public static void main(String [] args){
        System.out.println("********** Welcome to Linked List App **********");
        LinkedList linkedList = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
                printMenu();
                int choice = scanner.nextInt();
                if (choice == 1){
                    insertIntoLinkedList(linkedList);
                } else if(choice == 2){
                    deleteFromLinkedList(linkedList);
                } else if(choice == 3){
                    System.out.println("Enter the data to search");
                    int data = scanner.nextInt();  
                    if(linkedList.searchData(data))
                        System.out.println("Data found");
                    else
                        System.out.println("Data not found");
                }else if(choice == 4){
                     linkedList.printData();
                     System.out.println();
            }
                else if(choice == 5){
                      System.out.println("Exiting the program. Goodbye!");
                      break;
                } else {
                    System.out.println("Invalid choice! Please enter a valid option.");
                }
            } catch(Exception e){
                System.out.println("Invalid input! Please enter a valid number.");
            } finally{
            
            }
        }
    }

    private static void deleteFromLinkedList(LinkedList linkedList){
        
        Scanner scanner = new Scanner(System.in);
        printDeleteMenu();
        int deleteChoice = scanner.nextInt();

        if(deleteChoice == 1){
             linkedList.deleteFromBeginning();
             System.out.println("Deleted from beginning");
        }
        else if(deleteChoice == 2){
            linkedList.deleteFromEnd();
            System.out.println("Deleted from end");
        }
        else if(deleteChoice == 3){
             System.out.println("Enter the position to delete");
             int position = scanner.nextInt();
             linkedList.deleteFromPosition(position);
             System.out.println("Deleted from position "+position);
        }
        else{
            System.out.println("Invalid choice! Please enter a valid option.");
        }
    }

    private static void insertIntoLinkedList(LinkedList linkedList){
         Scanner scanner = new Scanner(System.in);
         printInsertMenu();
         int insertChoice = scanner.nextInt();
         System.out.println("Enter the data to insert");
         int data = scanner.nextInt();
         if(insertChoice == 1)
             linkedList.insertAtBeginning(data);
         else if(insertChoice == 2)
             linkedList.insertAtEnd(data);
         else if(insertChoice == 3){
              System.out.println("Enter the position to insert at");   
              int position = scanner.nextInt();
              linkedList.insertAtPosition(data, position);
          }
         else {
              System.out.println("Invalid choice! Please enter a valid option.");
              return;                                   
          }
         linkedList.printData();
        System.out.println();
    }
    
    // public static void main(String [] args){
    //     LinkedList list = new LinkedList();
    //     list.insertAtBeginning(10);
    //     list.insertAtBeginning(20);
    //     list.insertAtBeginning(30);
    //     list.insertAtEnd(40);
    //     list.insertAtPosition(50,2);
    //     list.insertAtPosition(51,1);
    //     list.insertAtPosition(52,0);
    //     list.printData();
    // }
    
}
