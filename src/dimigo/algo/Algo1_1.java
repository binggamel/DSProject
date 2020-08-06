package dimigo.algo;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.function.BinaryOperator;


public class Algo1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(pow(b,n));


    }

    private static BigInteger pow(int b, int n){

        BigInteger N = BigInteger.ONE ;
        for(int i = 0 ; i < n ; i ++){
             N = N.multiply(BigInteger.valueOf(b));
        }
        return N;

    }

    private static int pow2(int b, int n){
        if(n == 1) return b;
        return b * pow2(b,n-1);
    }

    private static BigInteger pow3(int b , int n ){
        if(n ==0 )return BigInteger.ONE;
        if(n==1) return BigInteger.valueOf(b);
        if(n%2 ==0){
            BigInteger r = pow(b,n/2);
            return r.multiply(r);
        } else{
            BigInteger r = pow(b,(n-1)/2);
            return r.multiply(r).multiply(BigInteger.valueOf(b));
        }
    }
}
