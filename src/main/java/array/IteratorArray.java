package array;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorArray <E> implements Iterator<E> {
    private  E[] array;
    private  int index=0;
    IteratorArray(E[] array){
        this.array=array;
    }
    @Override
    public boolean hasNext() {
        return index< array.length;
    }
    @Override
    public E next() {
        if(!hasNext())
            throw new NoSuchElementException();
        return array[index++];
    }
}
