package com.cracking;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class LinkedLists {

  public static void main(String[] args) {


    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Volvo");
    cars.add("Mazda");

    removeDups(cars);
  }

  public static void removeDups(LinkedList list) {

    HashSet hashSet = new HashSet<>();

    for (int i = 0; i < list.size(); i++) {
      hashSet.add(list.get(i));
    }

    System.out.println(hashSet);
  }


}
