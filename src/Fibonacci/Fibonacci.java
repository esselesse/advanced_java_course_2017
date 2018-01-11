package Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    private static MyBigNumber mbn = new MyBigNumber();
    private static MyBigNumber mbn1 = new MyBigNumber(1);

    public static void main(String[] args) {
        long n;
        Scanner in = new Scanner(System.in);
        n = in.nextLong();
        fib(n);
    }

    private static void fib(long n) {
        boolean sWitcher = true;
        while (n > 0) {
            if (sWitcher) {
                mbn = MyBigNumber.makeMeSuchBigLongNumberSum(mbn, mbn1);
            }else{
                mbn1 = MyBigNumber.makeMeSuchBigLongNumberSum(mbn1, mbn);
            }
            sWitcher=!sWitcher;
            n--;
        }

        if(sWitcher) {
            mbn1.writeString();
        }
        else {
            mbn.writeString();
        }
    }
}
