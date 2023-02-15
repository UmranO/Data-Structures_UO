package com.cydeo.KursSonrasiAlgoSorulari.Session3;

public class Node {
    Node next;
    String name;
    String lastName;
    String email;
    String phoneNumber;

    public Node(String name, String lastName, String email, String phoneNumber) {

        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }
//----ToString Method---------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "{" + name +
                ", "+ lastName +
                ", " + email +
                ", " + phoneNumber +
                '}';
    }
}
// We created a Node Class & with this Node class we can point to other Node Classes. And we have some Data like name,
//email.....
//We don't include Node next in the Constructor bec. we want it to be null by default.