package com.cydeo.KursSonrasiAlgoSorulari.Session3;

public class PhoneBook {
    Node head;
    Node tail;
    int size;

    public PhoneBook() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }
//Now we 've created the Phonebook so what we need is: we need an insert(), size(), indexOf(), findByName(),
// deleteByEmail(), sortByName(), A () for deleting the duplicated entries

    //----isEmpty Method------------------------------------------------------------------------------------------------
    boolean isEmpty() {
        return head == null;
    }

    //----Add Method-(Adds to the end)----------------------------------------------------------------------------------
    void insert(String name, String lastName, String email, String phoneNumber) {//we're sending them as parameters &
        // it will create a node inside the method & it will add that node into the linked list
        //Now to be on the safe side what is recommended is put the main steps
        //first we need is we need to create a node with the new data
        Node node = new Node(name, lastName, email, phoneNumber);

        if (head == null) {               //check if the list is empty
            head = tail = node;
        }           //if list is empty the new node will be the head and the tail
        //it's the only node in the list
        else {                       //if this is not the case: if the list is not empty you continue with the else part
            tail.next = node;        //we'll jump into the last one add it after the tail
            tail = node;               //new node is assigned to the tail. Now new node is the tail
        }                            //By default node.next is null

        size++;                     //after the if & else part before getting out of the () size should be increased
    }

    //----Size Method-(Adds to the end)---------------------------------------------------------------------------------
    /* if the variable size is given as above the size method is:
    int size () {return size;}
    BUT if the int size is not given we have to begin from the head & go through
    the list and count the entries as below UOS
    It takes O(n) operation if size variable is given it takes O(1)
    If we count in every insert or delete operation then we won't need to make a O(n) size type of method bec. if you
    keep that info you can return it with O(1)
     */
    int size() {
        size = 0;
        Node current;
        current = head;
        if (head == null) return size;
        else {
            while (current != null) {
                current = current.next;
                size++;
            }
        }
        return size;
    }

    //----IndexOf Method------------------------------------------------------------------------------------------------
    int indexOf(String email) {                    // send an email as a parameter and return the index of it (an int #)

        Node current = head;
        int index = 0;
        if (isEmpty()) {
            return -1;
        } else {
            while (current != null) {
                if (current.email.equals(email)) {
                    return index;
                }     // compare every node's email with the param. email

                index++;                      //in the while loop you need to increase the index after the if statement
                current = current.next;
            }
            return -1;                //if no match in the while loop it means we don't have such an email so return -1
            //-1 means we don't have such an element-bec. there is not an index value with -1
        }

    }

    //----FindByName Method-------------------------------------------------------------------------------------------------
    Node findByName(String name) {
        Node current;
        current = head;
        Node next;
        while (current != null) {
            if (current.name == name) {
                return current;
            }
            current = current.next;

        }
        return null;
    }

    //----DeleteByEmail Method----------------------------------------------------------------------------------------------
    void deleteByEmail(String email) {

        Node previous = head;
        Node current = head;

        if (isEmpty()) {
            System.out.println("List is empty");
        }

        while (current != null) {

            if (current.email.equals(email)) {

                // case 1: head
                if (current == head) {
                    head = current.next;
                    current.next = null;
                }

                // case 2: tail
                else if (current == tail) {
                    tail = previous;
                    previous.next = null;
                }

                // case 3: middle
                else {
                    previous.next = current.next;
                    current.next = null;
                }

                //After deletion
                size--;
            }
            previous = current;         //Bu noktadan sonra loop'u tamamalyana kadar pespese gidiyorlar
            current = current.next;
        }
    }

//----SwapData Method-------------------------------------------------------------------------------------------------------

    void swapData(Node node1, Node node2) {                                   //temp is created with node2's values

        Node temp = new Node(node2.name, node2.lastName, node2.email, node2.phoneNumber);

        node2.name = node1.name;                    // Since the new node is created with node2's values we assign
        node2.lastName = node1.lastName;            // node1's values to node2 since we are trying to swap
        node2.email = node1.email;
        node2.phoneNumber = node1.phoneNumber;

        node1.name = temp.name;                      //Assigning node temp's values(which are = node2's values)to node1
        node1.lastName = temp.lastName;
        node1.email = temp.email;
        node1.phoneNumber = temp.phoneNumber;

    }

    //----SortByNameSwap Method with swapping data ---------------------------------------------------------------------
    void sortByNameSwap() {
        //if we do like Node current=head, current2=head.next; it has a drawback: if the list is composed of 1 element
        //then the current2 will be assigned with null & cause trouble. So what we should do is 1st create the current
        //node and check if there is only 1 node or not. If there is only 1 node you can easily return.If that is not the
        //issue-list has more than 1 element-then you can continue assigning current2 with current.next & you can continue
        //moving these pointers together

        Node current = head, current2;

        if (current.next != null) {         //if current.next not null it means there are more than 1 element
            current2 = current.next;        //so we assign current.next to current2 -we'll have 2 pointers
        } else return;                      //if only 1 element no need to sort

        boolean swap = true;                //creating a boolean variable swap and 1st value of swap should be true
        //while swap it should continue ordering the list (). true demenin baska
        //yolu olarak kullaniyorum cunku sonra onu false'a cevirecegim
        //in order to enter the while () it should be true.
        while (swap) {
            swap = false;                   //1st set swap as false bec swap should only be true when there is a swap
            //if no swap I should check it here
            current = head;                 //assign pointers-should reset everything here-start from the head
            current2 = current.next;        //current2 is current next or head.next-Now I am at the beginning but after
            //every iteration if there is a swap I'll come to the while loop and I'll
            //start from the beginning again.Now I begin from the first & the following
            //I need a while loop to do the bubble-up operation.
            while (current != null && current2 != null) {     // the cases for the while loop to continue
                //compare the names of current & current2
                if (current.name.compareToIgnoreCase(current2.name) > 0)  //*if this value>0 it means the 1st elem. is> 2nd
                //and we need to swap them eg 1st is b & the 2nd is a
                {
                    swapData(current, current2);          //if 1st bigger then 2nd then we need {} after the if  bec.
                    swap = true;                             //we'll swap them & also swap needs to be set to true.
                    //bec when we swap them swap variable should carry true value.
                }                               //So we need to make 2 operations if the if statement is correct
                current = current.next;         //After if statement we'll move the pointers one step further
                current2 = current2.next;
            }

        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.name + "\n");
            current = current.next;
        }
        return "PhoneBook{\n" + sb + '}';
    }


//----DeleteDuplicatedEntry Method--------------------------------------------------------------------------------------
    void removeDuplicatesFromPhonebook() {
        Node current = head;
        while (current != null) {
            Node nextDistinctNode = current.next;
            while (nextDistinctNode != null && nextDistinctNode.email.equals(current.email)){
                nextDistinctNode = nextDistinctNode.next;
            }
            current.next = nextDistinctNode;
            current = nextDistinctNode;
        }

    }




//----------------------------------------------------------------------------------------------------------------------
//We'll create PhoneBook Class & this PhoneBook Class will hold nodes.
//Inside this Class I need 2 pointers: Head & Tail.
//int size to measure the length of the linked list
//we need constructor generate sirasinda select none'i sectik sonra manuallly create ettik
//in this one we'll say this.size=0 dedik. when we create it will be by default 0 but to be sure
//public PhoneBook(){
//  this.size=0;
//  this.head=null;               Now if you want to put it you can but by default it will be assigned head=tail=null
//  this.tail=null;               }               Normally it's null but sometimes in other languages the default is not null so in order
//                               to be on the safe side let's assign it to null. So do it as a routine.


//*Compare to () if 1 is bigger, if -1 smaller and 0 equal


}