package DSA_Problems.LinkedList;

public class MiddleNode {

    public ListNode middleNode(ListNode head){
        ListNode slow =head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public void traversal(ListNode head){
        ListNode ptr = head;

        while(ptr!=null){
            System.out.print(ptr.val+"->");
        }
    }

    public static void main(String args[]){
        ListNode l1 = new ListNode(12);
        ListNode l2 = new ListNode(18);
        ListNode l3 = new ListNode(87);
        ListNode l4 = new ListNode(67);
        ListNode l5 = new ListNode(82);
        ListNode l6 = new ListNode(22);
        ListNode l7 = new ListNode(29);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = null;

        ListNode head = l1;

        System.out.println("The Middle Node");
        MiddleNode obj = new MiddleNode();
        ListNode Newhead = obj.middleNode(head);
        System.out.println(Newhead.val);
        

    }
    
}
