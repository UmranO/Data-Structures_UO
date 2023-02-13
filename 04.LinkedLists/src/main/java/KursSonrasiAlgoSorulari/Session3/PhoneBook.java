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

}