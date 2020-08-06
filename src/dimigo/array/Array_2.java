package dimigo.array;

import java.util.Scanner;

public class Array_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(reverseString(a));



    }

    public static String reverseString(String a) {
        return ( new StringBuffer(a) ).reverse().toString();
    }
}
