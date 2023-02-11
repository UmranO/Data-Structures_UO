public class UOSinglyLinkedTest {
    public static void main(String[] args) {
        UOSinglyLinkedList uList=new UOSinglyLinkedList();

        for (int i = 0; i < 10; i++) {
            uList.add(i);
        }

       uList.printNodes();

    }
}
