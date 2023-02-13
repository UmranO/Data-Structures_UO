package KursSonrasiAlgoSorulari.Session3;

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

    //----isEmpty Method----------------------------------------------------------------------------------------------------
    boolean isEmpty(){
        return  head==null;
    }
    //----Add Method-(Adds to the end)--------------------------------------------------------------------------------------
    void insert(String name, String lastName, String email, String phoneNumber) {//we're sending them as parameters &
        // it will create a node inside the method & it will add that node into the linked list
        //Now to be on the safe side what is recommended is put the main steps
        //first we need is we need to create a node with the new data
        Node node = new Node(name, lastName, email, phoneNumber);

        if (head == null) {               //check if the list is empty
            head = tail = node;
        }           //if list is empty the new node will be the head and the tail
        //it's the only node in the list
        else {                          //if this is not the case: if the list is not empty you continue with the else part
            tail.next = node;           //we'll jump into the last one add it after the tail
            tail=node;                  //new node is assigned to the tail. Now new node is the tail
        }                               //By default node.next is null

        size++;                     //after the if & else part before getting out of the () size should be increased
    }
    //----Size Method-(Adds to the end)-------------------------------------------------------------------------------------
    /* if the variable size is given as above the size method is:
    int size () {return size;}
    BUT if the int size is not given we have to begin from the head & go through
    the list and count the entries as below UOS
    It takes O(n) operation if size variable is given it takes O(1)
    If we count in every insert or delete operation then we won't need to make a O(n) size type of method bec. if you
    keep that info you can return it with O(1)
     */
    int size(){
        size=0;
        Node current;
        current=head;
        if (head==null) return size;
        else {
            while (current!=null){
                size++;
                current=current.next;
            }
        }
        return size;
    }
    //----IndexOf Method----------------------------------------------------------------------------------------------------
    int indexOf(String email){                         // send an email as a parameter and return the index of it (an int #)

        Node current=head;
        int index=0;
        if(isEmpty()){
            return -1;}
        else{
            while (current!=null){
                if(current.email.equals(email)) {
                    return index;}     // compare every node's email with the param. email

                index++;                      //in the while loop you need to increase the index after the if statement
                current=current.next;
            }
            return -1;                //if no match in the while loop it means we don't have such an email so return -1
            //-1 means we don't have such an element-bec. there is not an index value with -1
        }

    }


}

