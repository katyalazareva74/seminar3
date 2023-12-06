package semin;

import java.io.DataInput;
import java.io.InputStream;

public class MegaClass <T extends Comparable, V extends InputStream & DataInput, K extends Number>{
    private T t;
    private V v;
    private K k;
    MegaClass(T t, V v, K k){
        this.t=t;
        this.v=v;
        this.k=k;
    }

    public T getT() {
        return t;
    }

    public K getK() {
        return k;
    }

    public V getV() {
        return v;
    }
    public void className(T t, V v, K k){
        System.out.println(t.getClass().getSimpleName()+" "+k.getClass().getSimpleName()+" "+v.getClass().getSimpleName());
    }
}
