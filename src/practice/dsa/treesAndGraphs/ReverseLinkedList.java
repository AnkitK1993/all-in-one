package practice.dsa.treesAndGraphs;

public class ReverseLinkedList {
      public static void main(String[] args) {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);
            System.out.println("Original Linked List : ");
            printList(head);
            System.out.println("\nReversed Linked List : ");
            ListNode reverseLinkedList = reverse(head);
            printList(reverseLinkedList);
      }

      static void printList(ListNode node) {
            while (node != null) {
                  System.out.print(node.val);
                  if (node.next != null)
                        System.out.print(" -> ");
                  node = node.next;
            }
      }

      static ListNode reverse(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;

            while(curr!=null){
                  ListNode temp = curr.next;
                  curr.next = prev;
                  prev  = curr;
                  curr = temp;
            }
            return prev;
      }

}

class ListNode {
      int val;
      ListNode next;
      ListNode(int val) { this.val = val; }
 }
