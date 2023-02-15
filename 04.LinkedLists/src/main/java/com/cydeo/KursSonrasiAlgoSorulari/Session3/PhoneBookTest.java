package com.cydeo.KursSonrasiAlgoSorulari.Session3;


public class PhoneBookTest {
    public static void main (String[] args) {
        PhoneBook mylist = new PhoneBook();
        PhoneBook liste = new PhoneBook();
        PhoneBook duplicatesList=new PhoneBook();

        System.out.println("---- Test insert ()-------------------------------------------------------------------------");

        mylist.insert("Cn", "Oan", "b@yahoo.com-0", "678");
        mylist.insert("Eal", "m", "cgmail.com-1", "100");
        mylist.insert("Amran", "Ozman", "a@yahoo.com", "345");      //deleted
        mylist.insert("Kum", "w", "Poioooo@gmail.com", "445153");   //deleted
        mylist.insert("y", "u", "yll@gmail.com-3", "3");
        mylist.insert("Mete", "Om", "f@H-2", "123456");
        mylist.insert("z", "l", "z@gmail.com-4", "153");

        liste.insert("a", "l", "index of a", "153");         //index of a 0
        liste.insert("c", "l", "index of c", "153");         //index of c 1
        liste.insert("b", "l", "index of b", "153");         //index of b 2
        liste.insert("t", "l", "index of t", "245");         //index of t 3

        duplicatesList.insert("Beril","B","BB@","12");
        duplicatesList.insert("Canan","C","CC@","13");
        duplicatesList.insert("Kean","K","KK@","14");
        duplicatesList.insert("Kean","K","KK@","14");

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

    //    mylist.sortByNameSwap();
        System.out.println("--sortByName by swap() - mylist :");
        System.out.print(mylist);
        System.out.println("--sortByName by swap() - liste :");
   //     liste.sortByNameSwap();
        System.out.print(liste);

        System.out.println("----Test SortByName () Changing the nodes ----------------------------------------------");

        System.out.println("--sortByName () Changing the nodes mylist-- ");

        mylist.sortByName();

        System.out.println(mylist.indexOf("b@yahoo.com-0"));                    //cn-0

        System.out.println(mylist.indexOf("cgmail.com-1"));                     //Eal-1

        System.out.println(mylist.indexOf("f@H-2"));                            //Mete-2 olmali ama 3 gorunuyor

        System.out.println(mylist.indexOf("yll@gmail.com-3"));                  //y-3 olmali ama 2 gorunuyor

        System.out.println(mylist.indexOf("z@gmail.com-4"));                    //z-4

        System.out.println("--sortByName () Changing the nodes liste-- ");

        System.out.println("--IndexOf liste:");
                                                                    //Before sorting
        System.out.println(liste.indexOf("index of a"));            //index of a 0
        System.out.println(liste.indexOf("index of b"));            //index of b 2
        System.out.println(liste.indexOf("index of c"));            //index of c 1
        System.out.println(liste.indexOf("index of t"));            //index of t 3

        System.out.println("--size of liste:");
        System.out.println(liste.size);

        System.out.println("--sortByName liste by changing the nodes:");
        liste.sortByName();                                         //After sorting
        System.out.println(liste.indexOf("index of a"));            //index of a should be 0
        System.out.println(liste.indexOf("index of b"));            //index of b should be 1 ama 2 gorunuyor
        System.out.println(liste.indexOf("index of c"));            //index of c should be 2 ama 1 gorunuyor
        System.out.println(liste.indexOf("index of t"));            //index of t should be 3



        System.out.println("----Test RemoveDuplicatesFromPhoneBook ()------------------------------------------------");
        System.out.println(duplicatesList);
        duplicatesList.removeDuplicatesFromPhonebook();
        System.out.println(duplicatesList);

    }
}