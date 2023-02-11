public class MySinglyLinkedList {

    Node head;
    Node tail;
    int size;

//----isEmpty Method----------------------------------------------------------------------------------------------------

    boolean isEmpty() {       //if head is null then it'll return true which means we don't have any elem.in the Singly Linked List
        return head == null;
    }
//----Add Method--------------------------------------------------------------------------------------------------------

    void add(int data) {                  //We are sending an integer value
        Node node = new Node(data);       //Created a new node object from the sent int data

        //There are 2 cases: 1)List is empty 2)List is not empty

        if (isEmpty()) {                  // if the List is empty
            head = tail = node;
            size++;

        } else {                          // if the List is not empty

            tail.next = node;             //Assign node to tail.next
            tail = node;                  //Since we added to the end we have to define our new tail which is node.
            size++;
        }
    }
//----PrintNodes Method------------------------------------------------------------------------------------------------
    void printNodes(){                                               //to print the nodes we made printNodes()

        Node current=head;                                           //Assigned head to current

        while (current!=null){                                       //As long as current which is the head NOT null

            if (current.next==null){System.out.println(current.id+" =>null");}
            else{System.out.print(current.id+" =>");}
            current=current.next;                                   // Bunu loop'un icine yazarsan sonsuz loop oluyor.
        }
    }

             //I start from the beginning and iterate to the end so Big O Notation of this runtime complexity() is O(n)
//----Delete Method------------------------------------------------------------------------------------------------
             void deletyeById(int id) {
                 //1-check if the list is empty
                 if(isEmpty()) System.out.println("List is empty!!");

                 //2-If it is not empty I reset my pointers to the beginning of the list.
                 //Assign prev and current with the head-This way I go to the beginning of the list

                 Node prev=head;
                 Node current=head;

                 while (current!=null) {                          //As long as current which is the head NOT nul will do the
                     //iteration with this while loop

                     if (current.id == id){                       //there is a match, we need to handle 3 cases
                         // case 1: head
                         if (head==current){
                             head=current.next;
                             current.next=null; }
                         // case 2: tail
                         else if (current==tail){
                             tail=prev;
                             prev.next=null;                 //Ex-Tail will be eligible for GC
                         }
                         // case 3: middle                     if it is not tail or head then it has to be in the middle
                         else{
                             prev.next=current.next;
                             current.next=null;              //Assign null to the current.next so it will be eligible for GC

                         }
                         //After deletion
                         size--;                              //After deletion whatever the case is size has to be decreased by 1
                     }
                     //if there is no match or there is a match but there can be other items with the same id then we have to
                     //so move forward to the other elements of the list/iterate until I come to the end / the current is null
                     prev=current;
                     current=current.next;
                 }
             }
}

/*-----Delete Method----------------------------------------------------------------------------------------------------
1-Check if the List is Empty
2-If it is not empty assign prev and current with the head-This way I go to the beginning of the list
3-As long as current which is the head NOT nul will do the iteration with a while loop to check if the argument id is
  matching any of the nodes' id.
4-If there is a match, we need to handle 3 cases:Matched id is in Head/Tail/In the middle
  ----If the node to be deleted is Head----
  head=current.next;
  current.next=null;
  ----If the node to be deleted is Tail----
  tail=prev;
  prev.next=null;
  ----If the node to be deleted is Middle-----
  If it is not Head or Tail it will be in the middle. This is how we find if it is in the middle
   prev.next=current.next;       -Makes the link from previous which is present current to current's next
   current.next=null;            -Will break the link of the present current and will be elligible for GC
5-After deletion decrease the size
   size--;
6-If there is no match or even there is a match there might be other items with the same id then we have to move forward
  to the other elements of the list/iterate until I come to the end / the current is null
  prev=current;                   -Assign current to previous       - This will keep the previous value
  current=current.next;           -Assign current.next to current   - This will make me jump to the next node

*/

//---------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------

