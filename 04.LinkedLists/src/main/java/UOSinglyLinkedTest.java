public class UOSinglyLinkedTest {

    public static void main(String[] args) {

        UOSinglyLinkedList uList=new UOSinglyLinkedList();

        System.out.println(uList.isEmpty());

        for (int i = 0; i < 10; i++) {
            uList.add(i);
        }
        uList.printNodes();

        uList.deleteById(9);
        uList.printNodes();

        uList.deleteById(4);
        uList.printNodes();

        uList.deleteById(0);
        uList.printNodes();
    }
}
