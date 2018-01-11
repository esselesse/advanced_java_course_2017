package Fibonacci;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by esselesse on 12.01.2018.
 */
public class MyBigNumber {
    private List<Long> longs = new ArrayList<Long>();

    MyBigNumber(){
        longs.add(0L);
    }

    MyBigNumber(int integer){
        longs.add((long) integer);
    }

    MyBigNumber(long longNumber){
        longs.add(longNumber);
    }

    MyBigNumber(String str){
        BigInteger bigInteger = new BigInteger(str);
        long a = bigInteger.longValueExact();
        longs.add(a);
    }

    BigInteger writeString() {
        BigInteger out = new BigInteger("0");
        for (int i = longs.size() - 1; i >= 0; i--) {
            out = out.shiftLeft(63);
            out = out.add(new BigInteger(Long.toString(longs.get(i))));
        }
        System.out.println(out);
        return out;
    }

    public List<Long> getLongs(){
        return this.longs;
    }

    public void setLongs(int index, Long element){
        this.longs.set(index, element);
    }

    public void add(long longNumber){
        this.longs.add(longNumber);
    }

    public static MyBigNumber makeMeSuchBigLongNumberSum(MyBigNumber mbn, MyBigNumber mbn1) {
        int temp=0;
        for (int iterator = 0; iterator < mbn.getLongs().size(); iterator++) {
            mbn.setLongs(iterator, mbn.getLongs().get(iterator)+mbn1.getLongs().get(iterator)+temp);
            temp=0;
            if (mbn.getLongs().get(iterator) < 0){
                mbn.setLongs(iterator, mbn.getLongs().get(iterator) & Long.MAX_VALUE);
                if (iterator+1==mbn.getLongs().size()) {
                    mbn.add(1L);
                    mbn1.add(0L);
                } else {
                    temp=1;
                }
            }
        }
        return mbn;
    }

}
