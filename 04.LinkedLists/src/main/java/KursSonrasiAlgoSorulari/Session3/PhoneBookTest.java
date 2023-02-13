package KursSonrasiAlgoSorulari.Session3;


public class PhoneBookTest {
    public static void main (String[] args){
        PhoneBook mylist=new PhoneBook();

        mylist.insert("Umran","Ozman","u@yahoo.com","345");
        mylist.insert("Un","Oan","um@yahoo.com","678");
        mylist.insert("Oz","l","P@gmail.com","153");

System.out.println("---- Test size ()-------------------------------------------------------------------------");

System.out.println(mylist.size);

System.out.println("---- Test isEmpty ()----------------------------------------------------------------------");

        System.out.println(mylist.isEmpty());

System.out.println("---- Test indexOf ()---------------------------------------------------------------------");

        System.out.println(mylist.indexOf("o@yahoo.com"));
        System.out.println(mylist.indexOf("u@yahoo.com"));

System.out.println("----Test FindByName ()-------------------------------------------------------------------");

        System.out.println(mylist.findByName("Umran"));
        System.out.println(mylist.findByName("A"));


    }


}
