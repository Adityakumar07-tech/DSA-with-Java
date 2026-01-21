public class ReverseLinkedList {
   static class Node {
        int data ;
        Node next;
        Node(int new_data){
            this.data = new_data;
            this.next = null;
        }
        static void reversePrint(Node head){
            if(head==null){
                return;
            }
            reversePrint(head.next);
            System.out.print(head.data + " ");
        }

      public static void main(String[] args) {
            Node head = new Node(10);
            head.next = new Node(20);
            head.next.next = new Node(30);
            head.next.next.next = new Node(40);
       // this methode will print the  reverse of linked list data
            reversePrint(head);
       }

    }
}
