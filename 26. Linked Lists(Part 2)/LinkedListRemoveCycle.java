public class LinkedListRemoveCycle {
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


    public boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;//+1
            fast = fast.next.next;//2
            if(slow==fast) {
                return true;//cycle exists
            }
        }
        return false;//cycle doesnt exist
    }

    public static void removeCycle() {
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow) {
                cycle = true;
                break;
            }
        }
        if(cycle==false) {
            return;
        }
        //find meeting point
        slow = head;
        Node prev = null;// last node
        while(slow!=fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Handles corner case where cycle starts at head
        if (prev == null) {
            // Find last node
            while (fast.next != head) {
                fast = fast.next;
            }
            fast.next = null;
        } else {
            // Remove cycle
            prev.next = null;
        }
        // //remove cycle -> last.next=null
        // prev.next = null;
    }
    public static void main(String[] args) {
        LinkedListRemoveCycle ll = new LinkedListRemoveCycle();

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        //1->2->3->1
        // Exception in thread "main" java.lang.NullPointerException: Cannot assign field "next" because "<local3>" is null
        // at LinkedListRemoveCycle.removeCycle(LinkedListRemoveCycle.java:70)
        // at LinkedListRemoveCycle.main(LinkedListRemoveCycle.java:82)

        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        //1->2->3->2
        
        System.out.println(ll.isCycle());
        removeCycle();
        System.out.println(ll.isCycle());
        
    }
}
