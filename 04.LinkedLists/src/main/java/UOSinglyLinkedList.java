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
                else {
                    System.out.print(current.id + " => ");
                }
                current = current.next;
            }
        }


    }

/*
-Create isEmpty()
-Create add()
-Create printNodes()
-Create delete()
 */

