import java.util.ArrayList;

public class MySinglyLinkedList {

    Node head;
    Node tail;
    int size;

    boolean isEmpty() {       //if head is null then it'll return true which means we don't have any elem.in the Singly Linked List
        return head == null;
    }

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

    void printNodes(){                                               //to print the nodes we made printNodes()

        Node current=head;                                           //Assigned head to current

        while (current!=null){                                       //As long as current which is the head NOT null

            if (current.next==null){System.out.print(current.id+"=>null");}
            else{System.out.print(current.id+"=>");}
            current=current.next;                                   // Bunu loop'un icine yazarsan sonsuz loop oluyor.
        }
    }

}
