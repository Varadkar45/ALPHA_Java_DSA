/*Detecting a Loop/Cycle in a LinkedList */

public class LinkedListDetectCycle {
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next= null;
        }
    } 

    public static Node head;
    public static Node tail;
    public static int size;// for size calculation



    public void addLast(int data) {
        //step 1 create new node
        Node newNode = new Node(data);
        size++;
        if(head==null) {
            head = tail = newNode;
            return;
        }
        //step 2 - newNode next = head
        tail.next = newNode;// linking

        //step 3 head = newNode
        tail = newNode;
    }
    
    public void print() {
        if(head==null) {
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }


    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public Node midNode(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while(fast!=null || fast.next!=null) {
            slow = slow.next;//+1
            fast = fast.next.next;//2
            if(slow==fast) {
                return true;//cycle exists
            }
        }
        return false;//cycle doesnt exist
    }

    public static void main(String[] args) {
        LinkedListDetectCycle ll = new LinkedListDetectCycle();

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        
        
        System.out.println(ll.isCycle());
        
    }
}
