package DSA_Problems.LinkedList;


public class ListNode{
    int val;
    ListNode next;

    public ListNode(int val){
        this.val = val;
    }

    public static void main(String args[]){
        ListNode l1 = new ListNode(10);
        ListNode l2 = new ListNode(20);
        ListNode l3 = new ListNode(30);
        ListNode l4 = new ListNode(40);

        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=null;

        ListNode temp = l1;
        while(temp!=null){
            System.out.println(temp.val+" ");
            temp= temp.next;
        }
    }
    
}


