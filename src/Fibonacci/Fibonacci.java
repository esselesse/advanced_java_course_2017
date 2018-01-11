package Fibonacci;
/**
 * Created by esselesse on 25.09.2017.
 */
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    private static List<Long> longs = new ArrayList<Long>();
    private static List<Long> longs1 = new ArrayList<Long>();

    public static void main(String[] args) {
        long n;
        longs.add(0L);
        longs1.add(1L);
        Scanner in = new Scanner(System.in);
        n = in.nextLong();
        fib(n);
    }

    private static void fib(long n) {
        boolean f=true;
        int temp;
        while (n>0) {
            temp=0;
            if (f) {
                for (int iterator = 0; iterator < longs.size(); iterator++) {
                    longs.set(iterator, longs.get(iterator)+longs1.get(iterator)+temp);
                    temp=0;
                    if (longs.get(iterator) < 0){
                        longs.set(iterator, longs.get(iterator)&Long.MAX_VALUE);
                        if (iterator+1==longs.size()) {
                            longs.add(1L);
                            longs1.add(0L);
                        } else {
                            temp=1;
                        }
                    }
                }
            }else{
                for (int iterator = 0; iterator < longs1.size(); iterator++) {
                    longs1.set(iterator, longs1.get(iterator)+longs.get(iterator)+temp);
                    temp=0;
                    if (longs1.get(iterator) < 0){
                        longs1.set(iterator, longs1.get(iterator)&Long.MAX_VALUE);
                        if (iterator+1==longs1.size()) {
                            longs.add(0L);
                            longs1.add(1L);
                        } else {
                            temp=1;
                        }
                    }
                }
            }

            f=!f;
            n--;
        }

        BigInteger out = new BigInteger("0");

        if(f) {
            for (int i = longs1.size()-1; i >=0 ; i--) {
                out = out.shiftLeft(63);
                out = out.add(new BigInteger(Long.toString(longs1.get(i))));
            }

            System.out.println(out);
        }
        else {
            for (int i = longs.size()-1; i >=0 ; i--) {
                out = out.shiftLeft(63);
                out = out.add(new BigInteger(Long.toString(longs.get(i))));
            }

            System.out.println(out);
        }
    }
}
