package com.company;

import sda.example.MyLinkedList;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("eklepacz@gmail.com");
        User user2 = new User("eklepacz@gmail.com");
        System.out.println(user1.equals(user2));
        System.out.println("user1= " + user1.hashCode());
        System.out.println("user2= " + user2.hashCode());

        MyArrayList list = new MyArrayList();
        for (int i = 0; i < 100 ; i++) {
            list.add(i);
        }

        HashSet<User> testSet = new HashSet<>();
        testSet.add(new User("mail"));
        testSet.add(new User("mail"));
        testSet.add(new User("mail"));
        testSet.add(new User("mail"));
        testSet.add(new User("mail"));

        System.out.println(testSet.size());

        SecondMap<Integer, String> sMap = new SecondMap<>();
        sMap.add(1,"QAZ");
        sMap.add(2, "QWER");
        System.out.println(sMap.hasKey(1));
        System.out.println(sMap.hasValue("QWERy"));

        MyLinkedList linkedL = new MyLinkedList();
        for (int i = 0; i < 100 ; i++) {
            linkedL.add("abc");
        }

        System.out.println(linkedL.getSize());



    }
}
