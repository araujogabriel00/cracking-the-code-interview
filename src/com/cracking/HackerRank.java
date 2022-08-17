package com.cracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HackerRank {

  public static void main(String[] args) {

  }

  public static int simpleArraySum(List<Integer> ar) {
    int total = 0;
    for (int i = 0; i < ar.size(); i++) {
      total += ar.get(i);
    }
    return total;
  }


  public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    List<Integer> list = new ArrayList<>();
    int a1 = 0;
    int b1 = 0;
    for (int i = 0; i <a.size(); i++) {
      if(a.get(i) > b.get(i) && a.get(i) != b.get(i)){
        a1++;
      }else if(a.get(i) < b.get(i) && a.get(i) != b.get(i)){
        b1++;
      }
    }
    list.add(a1);
    list.add(b1);

    return list;

  }
}
