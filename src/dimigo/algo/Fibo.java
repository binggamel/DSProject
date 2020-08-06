package dimigo.algo;

import java.math.BigInteger;
import java.util.Scanner;


public class Fibo {

    static BigInteger[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new BigInteger[n+1];
        System.out.println(fibo4(n));
    }



    private static int fibo(int n){
        if(n<=1)return n;
        return fibo(n-1) + fibo(n-2);
    }


    private static BigInteger fibo2(int n){

        if (n<=1) return BigInteger.valueOf(n);
        if (dp[n] != null) return dp[n];
        return dp[n] = fibo2(n-1).add(fibo2(n-2));
    }

    private static BigInteger fibo3(int n){
        if (n==0)return BigInteger.ZERO;
        dp[0] = BigInteger.ZERO;
        dp[1] = BigInteger.ONE;
        for (int i = 2; i <= n ; i ++){
            dp[i] = dp[i-1].add(dp[i-2]);
        }
        return dp[n];
    }

    private static BigInteger fibo4(int n){
        if(n<=1)return BigInteger.valueOf(n);
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE ;
        BigInteger temp = BigInteger.ZERO ;
        for(int i = 2 ;i <= n ; i ++ ){
            temp = a.add(b);
            a = b ;
            b = temp;
        }
        return b;
    }

}
