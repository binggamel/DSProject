package dimigo.Ex;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class javaEx10 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       int[] arr = new int[n];
       int[] count = new int[10];
       int cont = 0 ;

       for (int i = 0 ; i < n ; i ++){
           arr[i] = scanner.nextInt();
           count[arr[i]-1]++;
       }

       for (int i = 0 ; i < 10 ; i ++){
           if ( count[i] != 0 )cont++;
       }

        System.out.println(cont);
    }
}
