public class UOSinglyLinkedList {

        Node head;
        Node tail;
        int size;

//----isEmpty Method----------------------------------------------------------------------------------------------------

        boolean isEmpty(){
            return head==null;
        }
//----Add Method--------------------------------------------------------------------------------------------------------

        void add(int data) {

            Node node = new Node(data);         //node olmasi icin data olmasi gerek

            if (isEmpty()) {
                head =tail= node;
                size++;
            } else {
                tail.next = node;
                tail=node;
                size++;
            }
        }

 //----PrintNodes Method------------------------------------------------------------------------------------------------

        void printNodes() {

            Node current = head;

            while (current != null) {

               if (current.next == null) System.out.println(current.id + " => null");
                else {System.out.print(current.id + " => ");}
                current = current.next;
            }
        }
//----Delete Method------------------------------------------------------------------------------------------------
        void deleteById (int id){
         //Check if the list is empty
            if(isEmpty()){
                System.out.println("List is empty");
                     }
         //Assign prev and current with the head to reset your pointers to the beginning
            Node prev=head;
            Node current=head;
         while(current!=null){
             if (current.id==id) {
                 //if it is the Head
                 if (current == head) {
                     head = current.next;
                     current.next = null;
                 }
                 //if it is the Tail
                 else if (current == tail) {
                     tail = prev;
                     prev.next = null;
                 }

                 // if it is in the middle
                 else {
                     prev.next = current.next;
                     current.next=null;
                 }size--;
             }
         prev=current;
         current=current.next;

         }

        }}

/*
-Create isEmpty()
-Create add()
-Create printNodes()
-Create delete()
 */

