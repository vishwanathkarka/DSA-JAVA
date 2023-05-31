package Apnacollege;

public class LinkedList {
    public static class Node{
        int data;
        Node  next;
        // constructor of the node which automatically execute when we create an object
        public Node (int data){
            this.data = data;
            this.next = null;
        }   
    }
    // this are like a pointer
    // this are the reference variable which referce to the Node objects
    public static Node head;
    public static Node tail;
    // this is for finding the size of the linked list
    // we increment the value based on the adding and deleting 
    // when we add the Linked list we add add the size +=1
    // for deleting size -= 1;
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


    // this method is for the adding the values at the end of the linked list
    public void addEnd(int data){
        // storing the tail reference value int the temp variable 
        // which is an type of the  Node ref
      Node temp = tail;
      // increcing the size to find the size of the linked list
     size +=1;
     //creating the new List
      Node newNode = new Node(data);
      // and adding it to the tail of the linked list
      // we are using the temp intade of the tail tail should be constain it should not change
      temp.next = newNode;
      // we are making the tail as the newly added list
      tail = newNode;

    }


    // adding at the first
    public void addFirst(int data){
        // incrementing the size 
        size +=1;
        //create new node 
       Node newNode  = new Node(data);
// linked list has no values 
       if(head == null){
        // so head and tail is same
head = tail = newNode;
// returning so then the next code will not execute 
return;
       }
       // new node.next = head
       newNode.next = head;
       head = newNode;
    }


// this method is for printing the nodes
    public void printNodes(){
// list as no values
if(head == null){
    System.out.println("Linked List is empty");
    return;
}
// we are not chaning the head if we change the in next operation head will point to another value
// so we copy content in the head in temp
        Node temp = head;
        while(temp !=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


   // recursive search 
public int recuriveSearch( Node head, int target){
    // no values
if(head == null)
  return -1;
// target value is found
if(head.data == target)
   return 0;
// moving the next value
head = head.next;
// it iterative until it hits the base case which is moving the last value of the linked list
return recuriveSearch(head, target);
}


// searching the value with looping
    public int searchVal(int target){
        Node temp = head;
        // counting the index to print the index of the linked list
        int index = 0;
        // moving util it hit to the last values
        while(temp!=null){
            // if target is found
if(temp.data == target){
    System.out.println(index);
return index;
}
// moving to the next value 
temp = temp.next;
// incrementing the values
index+=1;
        }
        // if no values been found then
return -1;
        }
    

        // delete at the end 
    public int DeleteEnd(){
        // if size is 0 then we return value min 
        if(size ==0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        // size is 1 then it will delete
        else if(size == 1){
            int val = head.data;
            // making head and tail null
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

    public  Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!= null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
        }
        return slow;
            }

            public  boolean findPal(){
                if(head == null || head.next == null){
                    return true;
                }
                // find the mid
              Node mid =   findMid(head);

              // reversing the linked list
              Node prev = null;
              Node curr = mid;
              Node next;
              while(curr.next!=null){
next = curr.next;
curr.next = prev;
prev = curr;
curr = next;

              }
              Node right = prev;
              Node left = head;
              while(right !=null){
                if(left.data != right.data){
                    return false;
                }
                left = left.next;
                right = right.next;
              }
              return true;
            }
public static boolean isCycleExist(){
    // Node head;
    Node slow = head;
    Node fast = head;
    while(fast!=null && fast.next!= null){
slow = slow.next;
fast = fast.next.next;
if(slow == fast){
    return true;
}

    }
    return false;
}
private Node getMid(Node head){
    Node slow = head;
    Node fast = head.next;
    while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next;
    }
    return slow;
}
public Node merge(Node head1, Node head2){
    Node mergedLL = new Node(-1);
    Node temp = mergedLL;

    while(head1!=null && head2!=null){
        if(head1.data <= head2.data){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;

        }
        else{
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
    }

    while(head1!=null){
       temp.next = head1;
       head1 = head1.next;
       temp = temp.next;
    }

    while(head2!=null){
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
     }
     return mergedLL.next;
}

public Node mergeSort(Node head){
    if(head == null && head.next == null){
        return head;
    }
    // getting the mid with slow and fast approch 
    // in the even case  we are taking mid = low mid
    Node mid = getMid(head);
    // secound linked list head
    Node rightHead = mid.next;
mid.next = null;
// recursion left point
Node newleft = mergeSort(head);
// recursion right point
Node newRight = mergeSort(rightHead);

// merge
return merge(newleft, newRight);

}

// Zig-zag
public void zigZag(){
    // find mid
    Node slow = head;
    Node fast = head.next; // to get the first mid value ex  2, 4, 5,6  mid is 5 but we take 4 as mid for that we use it 
    while(fast!=null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    Node mid = slow;
    // reverse the 2nd half
    Node curr = mid.next;
    mid.next = null;
  
    Node next;
    Node prev = null;
    while(curr!=null){
        next =  curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

// zig zag the nodes
Node left = head;
Node right = prev;
Node nextL , nextR;
while(left != null && right != null){
nextL = left.next;
left.next = right;
nextR = right.next;
right.next = nextL;
left = nextL;
right = nextR;
}
}

    public static void main(String[] args) {
    LinkedList ll = new LinkedList(); // in this object only the complete Linked List are stored
    // ll.head = new Node(1);
    // ll.head.next = new Node(2);
ll.addFirst(4);
ll.addFirst(9);
ll.addFirst(6);
ll.addFirst(4);
ll.addFirst(99);
ll.addFirst(84);
ll.addFirst(234);
ll.addFirst(223);
// ll.addEnd(99);
// System.out.println("index"+ ll.searchVal(6));
// System.out.println("INDEXX"+ ll.recuriveSearch(ll.head,69));
// ll.head = ll.mergeSort(ll.head);
ll.printNodes();
System.out.println("------------");
ll.zigZag();
// System.out.println( );
ll.printNodes();

// head = new Node(1);
// head.next = new Node(2);
// head.next.next = new Node(3);
// head.next.next.next = head;
// System.out.println(isCycleExist());
    }
}
