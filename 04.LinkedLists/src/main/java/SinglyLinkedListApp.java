import java.util.ArrayList;

public class SinglyLinkedListApp {
    public static void main(String[] args) {

    MySinglyLinkedList myList=new MySinglyLinkedList();       //Creating object to test the methods we created in
                                                              // MySinglyLinkedList Class
    System.out.println(myList.isEmpty());

        for (int i = 0; i < 10; i++) {                        //Made a fori loop and added items into the list.
            myList.add(i);
        }
        myList.printNodes();                                  //to check if they are added correctly called printNodes()


    }
}
