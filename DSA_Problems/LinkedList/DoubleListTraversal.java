package DSA_Problems.LinkedList;

public class DoubleListTraversal {
    
    public void printFromBeg(DoubleListNode node){

        while(node.prev!=null){
            node = node.prev;
        }

        while(node!=null){
            System.out.print(node.val+"->");
            node = node.next;
        }
        System.out.println("Null");
    }

    public void printFromEnd(DoubleListNode node){

        while(node.next!=null){
            node=node.next;
        }
        while(node!=null){
            System.out.print(node.val+"->");
            node = node.prev;
        }
        System.out.println("Null");
    }

    public  void insertAtBeg(DoubleListNode node,int val){

        while(node.prev!=null){
            node = node.prev;
        }

        DoubleListNode newNode = new DoubleListNode(val);

        newNode.next=node;
        node.prev=newNode;
        newNode.prev=null;
    }

    public void insertAtEnd(DoubleListNode node,int val){
        while(node.next!=null){
            node = node.next;
        }

        DoubleListNode newNode = new DoubleListNode(val);

        node.next=newNode;
        newNode.prev = node;
        newNode.next = null;
    }

    public void  insertAtPos(DoubleListNode node,int val,int pos){
        while(node.prev!=null){
            node = node.prev;
        }

        

        for(int i=1;i<pos-1;i++){
            node = node.next;
        }
        DoubleListNode newNode = new DoubleListNode(val);

        newNode.prev = node;
        newNode.next = node.next;
        node.next.prev =newNode;
        node.next=newNode; 
       
        
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

        DoubleListTraversal doubleList = new DoubleListTraversal();
        
        doubleList.printFromBeg(l3);
        doubleList.insertAtBeg(l4,6);
        doubleList.printFromBeg(l4);
        doubleList.insertAtEnd(l2,20);
        doubleList.printFromBeg(l4);
        doubleList.insertAtPos(l3,96,3);
        doubleList.printFromBeg(l3);
    }
}
