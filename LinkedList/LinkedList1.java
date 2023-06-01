import java.util.*;

public class LinkedList1 {

    public static Node head;
    public static Node tail;
    public static int size = 0;

    // Node
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    void insertHead(int data) {
        // create a new node of data
        Node newNode = new Node(data);
        size++;
        // point head and tail to the single node
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Point new node to current head
        newNode.next = head;

        // place current head to newNode
        head = newNode;

    }

    void insertTail(int data) {
        // create a new node
        Node newNode = new Node(data);
        size++;

        // Point head and tail to single node
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Traverse until end
        while (tail.next != null) {
            tail = tail.next;
        }

        // Connect newNode with end
        tail.next = newNode;
        tail = newNode;
    }

    void insertMiddle(int index, int data) {
        Node temp = head;
        Node newNode = new Node(data);

        if (index == 0) {
            insertHead(data);
            return;
        }

        if (index == size - 1) {
            insertTail(data);
            return;
        }

        while (index > 1) {
            temp = temp.next;
            index--;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    void removeFirst() {
        // case when size is zero
        if (size == 0) {
            System.out.println("LinkedList is empty");
            return;
        }
        // size 1 means head and tail are on the same position
        else if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        }

        head = head.next;
        size--;
    }

    void removeLast() {
        // when size is zero
        if (size == 0) {
            System.out.println("LinkedList is empty");
            return;
        } else if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        tail = temp;
        temp.next = null;
        size--;

    }

    void removeNthFromLast(int n) {
        if (n == 0)
            return;
        if (n == size) {
            head = head.next;
            return;
        }

        int i = size - n;

        Node temp = head;
        while (i > 1) {
            temp = temp.next;
            i--;
        }

        temp.next = temp.next.next;
        size--;

    }

    Node findMiddle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    Node findMiddleForMergeSort(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    boolean checkPalindrome() {
        Node curr = findMiddle();
        Node prev = null;
        Node left = head;

        while (curr != null) {
            Node nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;

        }

        Node right = tail;

        while (right != null) {
            if (left.data != right.data)
                return false;

            left = left.next;
            right = right.next;

        }

        return true;

    }

    static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + "-->");
            head = head.next;
        }
        System.out.println("null");
    }

    // floyd's cycle finding algo

    boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }
        return false;
    }

    void makeCycle() {
        Node temp = tail;
        temp.next = head.next;
    }

    void removeCycle() {
        Node slow = head;
        Node fast = head;

        boolean isCycle = false;
        // detecting cycle exist or not
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                isCycle = true;
                break;
            }
        }

        if (!isCycle)
            return; // if not then return

        // if yes then find that node that cause cycle
        // prev track the just previos node of fast that causing cycle node
        slow = head;
        Node prev = null;

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;

    }

    // MergeSort

    Node mergeSort(Node head) {
        if (head == null || head.next == null)
            return head;

        // find middle
        Node middle = findMiddleForMergeSort(head);
        // new head of right part
        Node rightHead = middle.next;

        middle.next = null; // end of left part
        // left sort
        Node newSortedLeft = mergeSort(head);
        // right sort
        Node newSortedRight = mergeSort(rightHead);

        return mergeLinkedList(newSortedLeft, newSortedRight);

    }

    // Merge sorted linked list

    private Node mergeLinkedList(Node newSortedLeft, Node newSortedRight) {

        Node dummyList = new Node(-1);
        Node temp = dummyList;

        while (newSortedLeft != null && newSortedRight != null) {
            if (newSortedLeft.data <= newSortedRight.data) {
                temp.next = newSortedLeft;
                newSortedLeft = newSortedLeft.next;

            } else {
                temp.next = newSortedRight;
                newSortedRight = newSortedRight.next;
            }

            temp = temp.next;

        }

        while (newSortedLeft != null) {
            temp.next = newSortedLeft;
            newSortedLeft = newSortedLeft.next;
            temp = temp.next;
        }

        while (newSortedRight != null) {
            temp.next = newSortedRight;
            newSortedRight = newSortedRight.next;
            temp = temp.next;
        }

        return dummyList.next;

    }

    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();
        // ll.insertHead(1);
        // ll.insertHead(2);
        // ll.insertHead(3);

        ll.insertTail(1);
        ll.insertTail(2);
        ll.insertTail(10);
        ll.insertTail(4);
        ll.insertTail(5);
        ll.insertTail(19);
        ll.insertTail(7);
        ll.insertTail(15);

        // System.out.println(ll.isCycle());
        // ll.makeCycle();
        // System.out.println(ll.isCycle());
        // ll.removeCycle();
        // System.out.println(ll.isCycle());
        // printLL(head);

        printLL(head);
        printLL(ll.mergeSort(head));
    }
}