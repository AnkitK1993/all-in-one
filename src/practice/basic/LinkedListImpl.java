package practice.basic;

public class LinkedListImpl {

    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static LinkedListImpl insert(LinkedListImpl list, int data) {
        Node newNode = new Node(data);

        if (list.head == null) {
            list.head = newNode;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }

    public static void printList(LinkedListImpl list){
        Node currNode = list.head;
        System.out.println("LinkedListImpl : ");
        while(currNode!=null){
            System.out.println(currNode.data + "");
            currNode=currNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedListImpl list = new LinkedListImpl();

        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);

        printList(list);
    }
}
