package dimigo.array;

import java.util.Scanner;

public class Array_3 {
    public static void main(String[] args) {
        int firstNum = 0 ;
        Scanner scanner = new Scanner(System.in);
        firstNum = scanner.nextInt();
        int k = 0;
        int num = 0;



        for ( int i = 1 ; i <= firstNum ; i ++){
            k += i;
        }

        for ( int i = 1 ; i < firstNum ; i ++ ){
            num = scanner.nextInt();
            k = (k-num);
        }


        System.out.println(k);


    }
}
