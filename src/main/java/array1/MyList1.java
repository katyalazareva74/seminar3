package array1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyList1<E> implements Iterable<E> {
    private class IteratorArray1<E> implements Iterator<E> {
        private int index=0;
        @Override
        public boolean hasNext() {
            return index<size;
        }
        @Override
        public E next() {
            if(!hasNext())
                throw new NoSuchElementException();
            return (E) array[index++];
        }
    }
    private E[] array;
    private   int size=0;
    MyList1(){
        this.array=(E[]) new Object[1];
        this.size=0;
    }
    public void addElement(E element){
        if(size==array.length) {
            Object[] newarray = new Object[array.length + 1];
            System.arraycopy(array, 0, newarray, 0, array.length);
            newarray[size] = element;
            array = (E[])newarray;
        }
        else {
            array[size]=element;
        }
        size++;
    }
    public void printml(){
        for (E elem: array) {
            System.out.println(elem);
        }
    }
    public void removeelem(int index){
        System.arraycopy(array, index+1, array, index, size-1-index);
        array[size-1]=null;
        size--;
    }

    @Override
     public Iterator<E> iterator() {
        return new IteratorArray1<>();
    }

}
