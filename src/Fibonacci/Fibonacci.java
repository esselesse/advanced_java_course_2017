package Fibonacci; /**
 * Created by esselesse on 25.09.2017.
 */
import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.Long.reverse;

public class Fibonacci {
    public static long a0=1;
    public static long b0=0;
    public static long c0=0;
    public static long d0=0;

    public static long a1=0;
    public static long b1=0;
    public static long c1=0;
    public static long d1=0;

    public static void main(String[] args) {

//        for (int i = 0; i < 63; i++) {
//            a1<<=1;
//            a1+=1;
//            System.out.println(i + ": " + a1);
//        }
//        while(a1>0){
//        a1+=1;
//        System.out.println(": " + a1);}
//        while (a1<-1){
//            a1>>=1;
//            System.out.println(a1);
//        }
//        a1&=Long.MAX_VALUE;
//        System.out.println(a1);
//        a1=reverse(a1);
//        a1-=1;
//        a1=reverse(a1);
//        System.out.println(a1);
//
//
//        a=Long.MAX_VALUE;
//        System.out.println(a);



        long n;
        Scanner in = new Scanner(System.in);
        n = in.nextLong();
        boolean f=true;
        byte temp;
        while (n>0) {
            temp=0;
            if (f) {
                a1 = a0 + a1;
                if (a1 < 0){
                    temp=1;
                    a1&=Long.MAX_VALUE;
                }

                b1 = b0 + b1 + temp;
                temp=0;
                if (b1 < 0){
                    temp=1;
                    b1&=Long.MAX_VALUE;
                }

                c1 = c0 + c1 + temp;
                temp=0;
                if (c1 < 0){
                    temp=1;
                    c1&=Long.MAX_VALUE;
                }

                d1 = d0 + d1 + temp;
                temp=0;
                if (d1 < 0){
                    System.out.println("nope, too big for this shit");
                    return;
                }
            }else{
                a0 = a0 + a1;
                if (a0 < 0){
                    temp=1;
                    a0&=Long.MAX_VALUE;
                }

                b0 = b0 + b1 + temp;
                temp=0;
                if (b0 < 0){
                    temp=1;
                    b0&=Long.MAX_VALUE;
                }
                c0 = c0 + c1 + temp;
                temp=0;
                if (c0 < 0){
                    temp=1;
                    c0&=Long.MAX_VALUE;
                }

                d0 = d0 + d1 + temp;
                temp=0;
                if (d0 < 0){
                    System.out.println("nope, too big for this shit");
                    return;
                }
            }

            f=!f;
            n--;

            


        }

        BigInteger out = new BigInteger("0");

        if(f) {
            out=out.add(new BigInteger(Long.toString(d1)));
            out=out.shiftLeft(63);
            out=out.add(new BigInteger(Long.toString(c1)));
            out=out.shiftLeft(63);
            out=out.add(new BigInteger(Long.toString(b1)));
            out=out.shiftLeft(63);
            out=out.add(new BigInteger(Long.toString(a1)));
//            System.out.println(Long.toString(d1) + Long.toString(c1) + Long.toString(b1) + Long.toString(a1));
            System.out.println(out);
        }
        else {
            out=out.add(new BigInteger(Long.toString(d0)));
            out=out.shiftLeft(63);
            out=out.add(new BigInteger(Long.toString(c0)));
            out=out.shiftLeft(63);
            out=out.add(new BigInteger(Long.toString(b0)));
            out=out.shiftLeft(63);
            out=out.add(new BigInteger(Long.toString(a0)));
//            System.out.println(Long.toString(d0) + Long.toString(c0) + Long.toString(b0) + Long.toString(a0));
            System.out.println(out);
        }

    }
}
