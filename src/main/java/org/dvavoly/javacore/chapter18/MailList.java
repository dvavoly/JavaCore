package org.dvavoly.javacore.chapter18;

import java.util.LinkedList;
import java.util.List;

record Address(String name, String street, String city, String state, String code) {
};

public class MailList {
    public static void main(String[] args) {
        List<Address> mailList = new LinkedList<>();
        // Add elements to the linked list
        mailList.add(new Address("J. W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
        mailList.add(new Address("Ralph Baker", "1142 Maple Lane", "Mahomet", "IL", "61853"));
        mailList.add(new Address("Tom Carlton", "867 Elm St", "Campaing", "IL", "61820"));
        // Display the mailing list
        for (var item : mailList) {
            System.out.println(item);
        }
    }
}
