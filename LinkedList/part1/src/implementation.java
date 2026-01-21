import org.w3c.dom.ls.LSOutput;

public class implementation {

    // creation of Node
     static class Node {
        int data;
        Node next;

        Node(int new_data) {
            this.data = new_data;
            this.next = null;
        }
     }


        // this is user define LinkedList class for insert
        public static class LinkedList{
            Node head = null;
            Node tail = null;

            // this method insert the element in Linked List
            void insertAtEnd(int val){
                Node temp = new Node(val);
                if(head==null){
                    head = temp;
                }
                else{
                    tail.next = temp;
                }
                tail = temp;

            }

            // insert the element at the head of linked list
            void insertAthead(int val){
                Node temp = new Node(val);
                if(head==null){ // empty list
                    insertAtEnd(val);
                 //head = tail = temp;
                }
                else{ // non empty list
                    temp.next = head;
                    head = temp;
                }
            }

            // insert element at any index of Linked List
            void insertAt(int index , int val){
                Node t = new Node(val);
                Node temp = head ;
                if(index==size()){
                    insertAtEnd(val);
                    return;
                }
                else if(index==0){
                    insertAthead(val);
                    return;
                }
                else if(index<0 || index>size()){
                    System.out.println("Wrong index");
                    return;
                }
                for(int i=1; i<=index-1;i++){
                    temp = temp.next;
                }
                t.next = temp.next;
                temp.next = t;
            }
            // get element of specific index
            int getAt(int index){
                 if(index<0 || index>size()){
                    System.out.println("Wrong index");
                    return -1;
                }
                Node temp = head;
                for(int i=1; i<=index;i++){
                    temp = temp.next;
                }
                return temp.data;
            }

            // printing Linked list --> using display() method
            void display(){
                Node temp = head;
                while(temp!=null){
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
                System.out.println();
            }

            // return the size of linked list
            int size(){
                Node temp = head ;
                int count =0;
                while(temp!=null){
                    count++;
                    temp = temp.next;
                }
                return count;
            }
        }



    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(3);// 3
        ll.insertAtEnd(5);// 3 -> 5
        ll.display();
        ll.insertAthead(60); // 60 -> 3 -> 5
        ll.display();
        System.out.print("Size of LinkedList :  " + ll.size() );
        System.out.println();
        ll.insertAt(1,10); // 60 -> 10 -> 3 -> 5
        ll.display();
        ll.insertAt(4,30); // 60 -> 10 -> 3 -> 5 -> 30
        ll.display();
        ll.insertAt(0,100);// 100 -> 60 -> 10 -> 3 -> 5 -> 30
        ll.display();
        System.out.println(ll.getAt(4)); // 5
    }
}
