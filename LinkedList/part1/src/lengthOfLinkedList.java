public class lengthOfLinkedList  {
    // length of Linked List
    static int length(Node head){
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
     static class Node{
        int data ;
        Node next;
        Node(int new_data){
            this.data = new_data;
            this.next = null;
        }
    }
    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println(length(head));
    }
}
