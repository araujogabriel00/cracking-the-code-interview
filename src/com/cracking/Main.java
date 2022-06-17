package com.cracking;

public class Main {

    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arrayB = {10, 12, 13, 14, 15, 16, 17, 18};
        int n = 50;
        String srt = "ABCD";

        //foo(array);
        //printPairs(array);
        //printUnorderedPairs(array);
        //printUnorderedPairs(arrayA, arrayB);
        //printUnorderedPairs1000000(arrayA, arrayB);
        //isPrime(n);
        //factorial(n);
        //permutation(srt);
        //fib(n);
        //allFib(n);
        powersOf2(n);
    }

    //Examples

    //O(N)
    public static void foo(int[] array) {

        int sum = 0;
        int product = 1;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }

        for (int i = 0; i < array.length; i++) {
            product *= array[i];

        }

        System.out.println(sum + ", " + product);
    }

    //O(N*N)
    public static void printPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }

    //O(N*N)
    public static void printUnorderedPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }

    //O(AB)
    public static void printUnorderedPairs(int[] arrayA, int[] arrayB) {

        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayA[i] < arrayB[j]) {
                    System.out.println(arrayA[i] + ", " + arrayB[j]);
                }
            }
        }
    }

    //O(AB)
    public static void printUnorderedPairs1000000(int[] arrayA, int[] arrayB) {

        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                for (int k = 0; k < 1000000; k++) { //CONSTANT AMOUT OF WORK
                    System.out.println(arrayA[i] + ", " + arrayB[j]);
                }
                {
                }
            }
        }
    }

    //O(sqrt(N))
    public static boolean isPrime(int n) {

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println("false");
                return false;

            }

        }
        return true;
    }

    //O(N)
    public static int factorial(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 1;
        } else {
            System.out.println(n * 1);
            return (factorial(n - 1));
        }
    }

    public static void permutation(String str) {
        permutation(str, "");
    }

    private static void permutation(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                permutation(rem, prefix + str.charAt(i));
            }
        }
    }

    private static int fib(int n, int[] memo) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (memo[n] > 0) {
            return memo[n];
        }
        memo[n] = fib(n - 1, memo) + fib(n - 2, memo);

        return memo[n];
    }

    private static void allFib(int n) {
        int[] memo = new int[n + 1];
        for (int i = 0; i < n; i++) {
            System.out.println(i + ": " + fib(i, memo));
        }
    }

    private static int powersOf2(int n) {
        if (n < 1) {
            return 0;
        } else if (n == 1) {
            System.out.println(1);
            return 1;
        } else {
            int prev = powersOf2(n / 2);
            int curr = prev * 2;
            System.out.println(curr);
            return curr;
        }
    }

}