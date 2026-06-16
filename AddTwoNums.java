
class Node{
    int val;
    Node next;
    Node(int val){
        this.next=null;
        this.val=val;
    }
}
public class AddTwoNums {
    public static void main(String [] args){
        Node node = new Node(2);
        node.next=new Node(5);
        node.next.next=new Node(7);

        Node node1=new Node(3);
        node1.next=new Node(4);
        node1.next.next=new Node(1);
    
    }

    
}
