package Apnacollege;

public class LinkedList {
    public static class Node{
        int data;
        Node  next;
        public Node (int data){
            this.data = data;
            this.next = null;
        }   
    }
    public static Node head;
    public static Node tail;
    public static int size;
   
    public void add(int indx ,int data){
        Node newNode = new Node(data);
        Node temp  = head;
        int i =0;

        while(i<indx-1){
         temp = temp.next;
        i++;
        }
newNode.next = temp.next;
temp.next = newNode;

    }

    public void addEnd(int data){
      Node temp = tail;
     size +=1;
      Node newNode = new Node(data);
      temp.next = newNode;
      tail = newNode;

    }

    public void addFirst(int data){
        size +=1;
        //create new node 
       Node newNode  = new Node(data);
// System.out.println(head);
       if(head == null){
head = tail = newNode;
return;
       }
       // new node.next = head
       newNode.next = head;
       head = newNode;
    }


    public void printNodes(){
if(head == null){
    System.out.println("Linked List is empty");
    return;
}
        Node temp = head;
        while(temp !=null){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
public int recuriveSearch( Node head, int target){
if(head == null)
  return -1;

if(head.data == target)
   return 0;
head = head.next;

return recuriveSearch(head, target);
}

    public int searchVal(int target){
        Node temp = head;
        int index = 0;
        while(temp!=null){
if(temp.data == target){
    System.out.println(index);
return index;
}
temp = temp.next;
index+=1;
        }
return -1;
        }
    


    public int DeleteEnd(){
        if(size ==0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }
      Node prev = head;
      for(int i =0; i<size-2;i++){
prev = prev.next;
      }
      int val = prev.data;
      prev.next = null;
      tail = prev;
      // decreasing the size of the linked list
      size--;
  return val;
    }

    public static void main(String[] args) {
    LinkedList ll = new LinkedList(); // in this object only the complete Linked List are stored
    // ll.head = new Node(1);
    // ll.head.next = new Node(2);
ll.addFirst(4);
ll.addFirst(6);
ll.addFirst(9);
ll.addEnd(99);
System.out.println("index"+ ll.searchVal(6));
System.out.println("INDEXX"+ ll.recuriveSearch(ll.head,69));
ll.printNodes();
System.out.println("size"+ll.size);
    }
}
