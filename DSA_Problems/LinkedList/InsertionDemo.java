package DSA_Problems.LinkedList;

public class InsertionDemo {

    public static ListNode insertAtBegining(ListNode head,int calToInsert){

        ListNode newNode = new ListNode(calToInsert);

        newNode.next=head;
        head=newNode;
        return head;
        
    }

    public void traversal(ListNode head){

        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println("NUll");
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

        System.out.println("Normal Traversal Before Insert at Begining ");

        ListNode head = l1;
        InsertionDemo obj = new InsertionDemo();
        obj.traversal(head);

        System.out.println();

        head=insertAtBegining(head,49);
        obj.traversal(head);

    }
    
}
