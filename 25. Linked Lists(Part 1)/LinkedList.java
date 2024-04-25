public class LinkedList {
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

    public void addFirst(int data) {
        //step 1 create new node
        Node newNode = new Node(data);
        size++;//for adding size
        if(head==null) {
            head = tail = newNode;
            return;
        }
        //step 2 - newNode next = head
        newNode.next = head;// linking

        //step 3 head = newNode
        head = newNode;
    }

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
    //Add in the middle
    public void add(int idx, int data) {
        if(idx==0) {
            addFirst(data);
            return;
        }
        size++;

        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while(i<idx-1) {
            temp = temp.next;
            i++;
        }
        //i=idx-1; temp->prev
        newNode.next = temp.next;
        temp.next = newNode;
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

    public int removeFirst() {
        if(size==0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size==1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if(size==0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size==1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev:i=size-2
        Node prev = head;
        for(int i = 0; i<size-2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;//tail.data
        prev.next = null;
        size--;
        return val;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.print();
        // ll.addFirst(1);
        // ll.print();
        // ll.addFirst(2);
        // ll.print();

        // ll.addLast(3);
        // ll.print();
        // ll.addLast(4);
        // ll.print();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2,3);
        ll.print();
        System.out.println(size);
        ll.removeFirst();
        ll.print();
        System.out.println(size);
        ll.removeLast();
        ll.print();
        System.out.println(size);
    }
}