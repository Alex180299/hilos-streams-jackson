package com.example.threads2;

import java.util.Hashtable;

public class HashTableDemo {

    public static void main(String[] args) {
        Hashtable<String, String> phonebook = new Hashtable<>();

        phonebook.put("Name1", "123");
        phonebook.put("Name2", "456");
        phonebook.put("Name3", "789");
        phonebook.put("Name4", "147");
        phonebook.put("Name5", "258");
        phonebook.put("Name6", "369");

        phonebook.forEach((k,v) -> {
            System.out.println(k + " - " + v);
        });
    }

}
