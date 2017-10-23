package com.company;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("eklepacz@gmail.com");
        User user2 = new User("eklepacz@gmail.com");
        System.out.println(user1.equals(user2));
        System.out.println("user1= " + user1.hashCode());
        System.out.println("user2= " + user2.hashCode());
    }
}
