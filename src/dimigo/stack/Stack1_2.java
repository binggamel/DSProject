package dimigo.stack;

import java.util.Scanner;
import java.util.Stack;

public class Stack1_2 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        for ( int i = 0 ; i < str.length() ; i ++ ){
            stack.push(str.charAt(i));
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }


    }
}
