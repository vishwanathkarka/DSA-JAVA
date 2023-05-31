package Apnacollege;

public class doubleLinkedList {

    public class Node {
int data;
Node prev ;
Node next;

public Node(int data){
    this.data = data;
    this.prev = null;
    this.next = null;
}

    }
    public static Node  head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev =  newNode;
        head = newNode;
        size++;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int removeFist(){
        int val = head.data;
  head = head.next;
  head.prev = null;
  size--;
  return val;
    }

    public void reverseNode(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;  
        }
        head = prev;
    }
    public static void main(String[] args) {
        
    }
}
