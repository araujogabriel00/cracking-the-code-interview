package com.cracking;

public class ArrayAndStrings {

  public static void main(String[] args) {

    /*String str1 = "gabriel";
    String str2 = "leirbag";
    isPermutation(str1, str2);*/

    //char[] str = "Mr John Smith ".toCharArray();

    // Prints the replaced string
    //str = urlFy(str);

    //for (int i = 0; i < str.length; i++) System.out.print(str[i]);

    /*if (ArrayAndStrings.checkUniqueChar(str)) {
        System.out.println("The String " + str + " has all unique characters");
    }else
        System.out.println("The String " + str + " has duplicate characters");*/


    System.out.println(palindromePermutation("Tact Coa"));

  }

  public static boolean checkUniqueChar(String str) {
    for (int i = 0; i < str.length(); i++) {
      for (int j = 0; j < i; j++) {
        if (str.charAt(i) == str.charAt(j)) {
          System.out.println("The string has no unique characters");
          return false;
        }
      }
    }
    System.out.println("The string has all unique characters");
    return true;
    /*return str.chars().filter(e -> Collections.frequency(str.chars().boxed().collect(Collectors.toList()), e) > 1).count() <= 1;*/

  }

  public static boolean isPermutation(String str1, String str2) {

    char[] sort1 = sortString(str1);
    char[] sort2 = sortString(str2);

    int count = 0;

    for (int i = 0; i < sort1.length; i++) {

      if (sort1[i] == sort2[i]) {
        count++;
      }
    }

    if (count < sort1.length) {
      return false;
    }

    return true;
  }

  public static char[] sortString(String str) {

    char arr1[] = str.toCharArray();

    if (arr1.length == 0) {
      System.out.println("A string esta vazia");
    }

    char temp;

    for (int i = 0; i < arr1.length; ) {
      for (int j = i + 1; j < arr1.length; ) {
        if (arr1[j] < arr1[i]) {
          temp = arr1[i];
          arr1[i] = arr1[j];
          arr1[j] = temp;
        }
        j += 1;
      }
      i += 1;
    }
    return arr1;
  }

  public static char[] urlFy(char[] str) {

    int MAX = 1000;

    // count spaces and find current length
    int space_count = 0, i = 0;
    for (i = 0; i < str.length; i++) if (str[i] == ' ') space_count++;

    // count spaces and find current length
    while (str[i - 1] == ' ') {
      space_count--;
      i--;
    }

    // Find new length.
    int new_length = i + space_count * 2;

    // New length must be smaller than length
    // of string provided.
    if (new_length > MAX) return str;

    // Start filling character from end
    int index = new_length - 1;

    char[] old_str = str;
    str = new char[new_length];

    // Fill rest of the string from end
    for (int j = i - 1; j >= 0; j--) {

      // inserts %20 in place of space
      if (old_str[j] == ' ') {
        str[index] = '0';
        str[index - 1] = '2';
        str[index - 2] = '%';
        index = index - 3;
      } else {
        str[index] = old_str[j];
        index--;
      }
    }
    return str;
  }

  public static boolean palindromePermutation(String string){

    int [] char_count = new int[128];

    for (int i = 0; i < string.length(); i++) {
      char_count[string.charAt(i)]++;
    }

    int count = 0;
    for (int i = 0; i < 128; i++) {
      count += char_count[i] % 2;
    }

    return count <= 1;
  }
}
