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

    public void deleteFirst(DoubleListNode node){

        while(node.prev!=null){
            node = node.prev;
        }

        node = node.next;
        node.prev = null;

    }

    public void deleteLast(DoubleListNode node){
        while(node.next.next!=null){
            node = node.next;
        }

        node.next.prev=null;
        node.next=null;
    }

    public void deleteAtPoint(DoubleListNode node,int pos){

        while(node.prev!=null){
            node = node.prev;
        }
        
        for(int i=1;i<pos-1;i++){
            node = node.next;
        }

        node.next.next.prev=node;
        node.next=node.next.next;
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
        

        //traversal from begining 
        doubleList.printFromBeg(l3);

        //insert at begining
        doubleList.insertAtBeg(l4,6);
        doubleList.printFromBeg(l4);

        //insert at End
        doubleList.insertAtEnd(l2,20);
        doubleList.printFromBeg(l4);

        //insert at position
        doubleList.insertAtPos(l3,96,3);
        doubleList.printFromBeg(l3);

        //deleting at first
        doubleList.deleteFirst(l2);
        doubleList.printFromBeg(l3);

        //deleting at last
        doubleList.deleteLast(l2);
        doubleList.printFromBeg(l3);

        //delete at position
        doubleList.deleteAtPoint(l4,3);
        doubleList.printFromBeg(l2);
    }
}
