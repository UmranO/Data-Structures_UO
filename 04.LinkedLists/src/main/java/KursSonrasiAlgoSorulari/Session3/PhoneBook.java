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


}