import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

Node node1=new Node(1);  //Created 4 nodes using 1 parameter constructor
Node node2=new Node(2);
Node node3=new Node(3);
Node node4=new Node(4);

node1.next=node2;           //Assigned next values of nodes 1,2,3. We expect to see the next value of node4 is null.
node2.next=node3;
node3.next=node4;

System.out.println("Node1's address is: " + node1 + " - Node1's next address is: " + node1.next);
System.out.println("Node2's address is: " + node2 + " - Node2's next address is: " + node2.next);
System.out.println("Node3's address is: " + node3 + " - Node3's next address is: " + node3.next);
System.out.println("Node4's address is: " + node4 + " - Node4's next address is: " + node4.next);

// Now we'll link the nodes to create a Singly Linked List

Node current;     //Created a temporary variable
Node head=node1;  //Assigned node1 to head - definied our starting point-giving a name to 1st element which is node1
                  //Now we have a variable called head and the value of it is node1 Now well start iterate over the list
current=head;     //Assigned head to current. So current is our starting point - refering to our head which is node1

     while (current!=null){                            //while current is not null do the following
     System.out.println("Id of node is: "+current.id); //will print the id values of the nodes
                                                       //printed the current's id value so now I'll jump to the next one
     current=current.next;}                            //Right now I need to jump to the next one


















 System.out.println("--------------------------------------------------------------------------------------------");

//      //  Node node1 = new Node(13);
//       // Node node2 = new Node(22);
//        //Node node3 = new Node(31);
//       // Node node4 = new Node(40);
//        //node1.next = node2;
//       // node2.next = node3;
//      //  node3.next = node4;
//
//        //System.out.println("Node1's address is: " + node1 + "Node1' next address is " + node1.next);
//       // System.out.println("Node2's address is: " + node2 + "Node2' next address is " + node2.next);
//       // System.out.println("Node3's address is: " + node3 + "Node3' next address is " + node3.next);
//       // System.out.println("Node4's address is: " + node4 + "Node4' next address is " + node4.next);
//        System.out.println("-----------------------0------------------------------------------");
//        MySinglyLinkedList ulist=new MySinglyLinkedList();
//
//      ulist.add(13);
//      ulist.add(22);
//      ulist.add(33);
//      ulist.add(44);
//       System.out.println(ulist);
//
//        System.out.println("-----------------------0------------------------------------------");
//      /*
//        int indexOf(int id){
//            if (isEmpty()) return -1;
//            int pos=0;
//            // iterate through the list
//            Node current=head;// set my current with the starting element;
//            while(current!=null){
//                if(current.id==id) return pos;
//                pos++;
//                current=current.next;
//            }
//            return -1;
//        }
//        */
//
//        //Asagisi Umran version of indexOf(int id)
//        System.out.println("-----------------------0------------------------------------------");
//
//      /*  int indexOf(int id){
//            if (isEmpty()) return -1;
//            int pos = 0;
//            Node current;
//            Node head = node1;
//            current = head;
//
//            int i = 0;                 //u
//            for {
//                System.out.println("Id of node " + i++ + " is: " + current.id);
//                current = current.next;
//            }
//        }
//*/

    }
}