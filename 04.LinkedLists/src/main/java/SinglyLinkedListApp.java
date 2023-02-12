public class SinglyLinkedListApp {

    public static void main(String[] args) {

    MySinglyLinkedList myList=new MySinglyLinkedList();       //Creating object to test the methods we created in
                                                              // MySinglyLinkedList Class
  //---- Test isEmpty ()----------------------------------------------------------------------------------------------------

    System.out.println(myList.isEmpty());

  //---- Test add ()----------------------------------------------------------------------------------------------------

        for (int i = 0; i < 10; i++) {                        //Made a fori loop and added items into the list.
            myList.add(i);
        }
  //---- Test addFirst ()-----------------------------------------------------------------------------------------------

        myList.addFirst(10);

  //---- Test printNodes ()---------------------------------------------------------------------------------------------

        myList.printNodes();                                  //to check if they are added correctly called printNodes()

  //---- Test deleteById ()---------------------------------------------------------------------------------------------

        myList.deletyeById(7);
        myList.printNodes();

        myList.deletyeById(0);
        myList.printNodes();

        myList.deletyeById(9);
        myList.printNodes();

  //---- Test indexOf ()------------------------------------------------------------------------------------------------

        System.out.println("index of 5 is " + myList.indexOf(5));
        System.out.println("index of 1 is " + myList.indexOf(1));
    }
}
