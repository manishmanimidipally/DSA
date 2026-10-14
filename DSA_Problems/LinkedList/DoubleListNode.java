package DSA_Problems.LinkedList;

public class DoubleListNode {
    int val;
    DoubleListNode next;
    DoubleListNode prev;

    DoubleListNode(int val){
        this.val =val;
    }

    public static void main(String args[]){
        DoubleListNode l1 = new DoubleListNode(1);
        DoubleListNode l2 = new DoubleListNode(2);
        DoubleListNode l3 = new DoubleListNode(3);
        DoubleListNode l4 = new DoubleListNode(4);

        l1.next=l2;
        l1.prev=null;
        l2.next=l3;
        l2.prev=l1;
        l3.next=l4;
        l3.prev=l2;
        l4.next =null;
        l4.prev=l3;

        DoubleListNode temp = l1;

        while(temp!=null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println("NUll");

        
        DoubleListNode ptr = l4;
        while(ptr!=null){
            System.out.print(ptr.val+"->");
            ptr = ptr.prev;
        }
         System.out.println("NUll");
    }
}
