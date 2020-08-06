package dimigo.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Card {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        int num = 0 ;
        num = scanner.nextInt();

        for (int i = 1 ; i <= num ; i ++ ){
            queue.offer(i);
        }

        for (int i = 0 ; i < num-1 ; i ++ ){
            queue.poll();
            queue.offer(queue.poll());
        }

        System.out.println(queue.peek());




//        Scanner scanner = new Scanner(System.in);
//        int num = 0;
//        num = scanner.nextInt();
//
//        int count = num;
//        for(int i = num ; i <= num -1 ; i ++ ){
//            if (num % 2 == 1){
//
//            }
//        }

    }
}
