
public class CreatingNode {
    public static void Display(Node head){
        while(head!=null){
            System.out.print(head.data +" ");
            head = head.next;
        }
    }

   static class Node{
        int data ;
        Node next;
        // constructor
        Node(int new_data){
            this.data = new_data;
            this.next = null;
        }
    }
 public static void main(String[] args) {
     // creating first node as head
        Node head = new Node(10);

      // linking seconde node
       head.next = new Node(23);

       // linking third node
        head.next.next = new Node(43);

       // printing linked list

//       Node temp = head ;
//       while(temp!=null){
//           System.out.print(temp.data + " ");
//           temp = temp.next;
//       }

     // printing by calling method
      Display(head);

    }
}
