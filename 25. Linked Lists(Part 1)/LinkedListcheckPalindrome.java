public class LinkedListcheckPalindrome {
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

    public boolean checkPalindrome() {
        if(head==null||head.next==null) {
            return true;
        }

        //find middle
        Node mid = midNode(head);
        //Reverse 2nd Half
        Node curr = mid;
        Node prev = null;
        while(curr!=null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;//right half ka head
        Node left = head;

        //Check if left half and right half are equal
        while(right!=null) {
            if(left.data!=right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        LinkedListcheckPalindrome ll = new LinkedListcheckPalindrome();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
    
        
        ll.print();
        System.out.println(ll.checkPalindrome());
        
    }
}
