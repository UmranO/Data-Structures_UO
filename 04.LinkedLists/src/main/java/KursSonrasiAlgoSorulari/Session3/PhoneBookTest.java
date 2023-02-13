package KursSonrasiAlgoSorulari.Session3;

import java.util.Arrays;

public class PhoneBookTest {
    public static void main (String[] args){
        PhoneBook mylist=new PhoneBook();

        mylist.insert("Umran","Ozman","u@yahoo.com","345");
        mylist.insert("Un","Oan","um@yahoo.com","678");
        mylist.insert("Oz","l","P@gmail.com","153");


//---- Test isEmpty ()------------------------------------------------------------------------------------------------

        System.out.println(mylist.isEmpty());


    }
}
