package KursSonrasiAlgoSorulari.Session3;


public class PhoneBookTest {
    public static void main (String[] args){
        PhoneBook mylist=new PhoneBook();

        PhoneBook liste=new PhoneBook();

System.out.println("---- Test insert ()-------------------------------------------------------------------------");


        mylist.insert("Cn","Oan","b@yahoo.com-0","678");
        mylist.insert("Eal","m","cgmail.com-1","100");
        mylist.insert("Amran","Ozman","a@yahoo.com","345");      //deleted
        mylist.insert("Kum","w","Poioooo@gmail.com","445153");   //deleted
        mylist.insert("y","u","yll@gmail.com-3","3");
        mylist.insert("Mete","Om","f@H-2","123456");
        mylist.insert("z","l","z@gmail.com-4","153");

        liste.insert("a","l","index of a","153");         //index of a 0
        liste.insert("c","l","index of c","153");         //index of c 1
        liste.insert("b","l","index of b","153");         //index of b 2
        liste.insert("t","l","index of t","245");         //index of t 3

System.out.println("---- Test size ()-------------------------------------------------------------------------");

System.out.println(mylist.size);

System.out.println("---- Test isEmpty ()----------------------------------------------------------------------");

        System.out.println(mylist.isEmpty());

System.out.println("---- Test indexOf ()---------------------------------------------------------------------");

        System.out.println(mylist.indexOf("o@yahoo.com"));
        System.out.println(mylist.indexOf("a@yahoo.com"));

System.out.println("----Test FindByName ()-------------------------------------------------------------------");

        System.out.println(mylist.findByName("Amran"));
        System.out.println(mylist.findByName("A"));

System.out.println("----Test DeleteByEmail ()----------------------------------------------------------------");

        System.out.println(mylist.indexOf("a@yahoo.com"));

        mylist.deleteByEmail("a@yahoo.com");           //deleted so not sorted

        System.out.println(mylist.indexOf("a@yahoo.com"));

        System.out.println(mylist.indexOf("Poioooo@gmail.com"));

        mylist.deleteByEmail("Poioooo@gmail.com");     //deleted so not sorted

        System.out.println(mylist.indexOf("Poioooo@gmail.com"));

System.out.println("----Test SortByNameSwap----------------------------------------------------------------");

          mylist.sortByNameSwap();
          System.out.println("--sortByName liste:");
          System.out.println(mylist);
          liste.sortByNameSwap();
          System.out.println(liste);



}
}