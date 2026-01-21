public class RecursivePrinting {
    public static void Display(CreatingNode.Node head){
        while(head!=null){
            System.out.print(head.data +" ");

        }
    }

    static class Node{
        int data ;
        CreatingNode.Node next;
        // constructor
        Node(int new_data){
            this.data = new_data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        // creating first node as head
        CreatingNode.Node head = new CreatingNode.Node(10);

        // linking seconde node
        head.next = new CreatingNode.Node(23);

        // linking third node
        head.next.next = new CreatingNode.Node(43);


        // printing by calling method
        Display(head);

    }
}
