package DSA_Problems.LinkedList;

public class TraversalList {
    public void Traversal(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String args[]){
        ListNode l1 = new ListNode(23);
        ListNode l2 = new ListNode(20);
        ListNode l3 = new ListNode(50);
        ListNode l4 = new ListNode(40);

        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=null;

        ListNode head= l1;

        TraversalList obj = new TraversalList();
        obj.Traversal(head);
        

    }
}
