package array;

import java.util.Iterator;

public class MyList <E> implements Iterable<E>{
    private E[] array;
    private   int size=0;
    MyList(){
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
        return new IteratorArray<>(this.array);
    }

}
