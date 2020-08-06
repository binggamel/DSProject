package dimigo.array;

import java.util.Random;
import java.util.Scanner;

public class Array_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = 0;
        int ransize = 0;
        size = scanner.nextInt();
        ransize = scanner.nextInt();

        int k = 0;

        int[] arr = new int[size];
        int[] ranDomArr = new int[ransize+1];


        for (int i = 0 ; i < size ; i ++){
            k = new Random().nextInt(ransize+1);
            arr[i] = k;
            ranDomArr[k]++;
        }

        for(int i = 0 ; i < size ;i ++){
            System.out.printf("%d " ,arr[i]);
        }

        System.out.println();

        for(int i = 0 ; i <= ransize ; i++){

            System.out.println(i+"의 개수: "+ranDomArr[i]);
        }

    }
}
